package ro.digitalnation.proiect;

import org.springframework.web.bind.annotation.RestController;

import dataobjects.Abonament;
import dataobjects.Calator;
import dataobjects.Categoria;
import dataobjects.Cursa;
import dataobjects.DateCategorie;
import dataobjects.EmitereAbonament;
import dataobjects.EmitereBilet;
import dataobjects.MersMicrobuze;
import dataobjects.Reduceri;
import dataobjects.Statie;
import dataobjects.Tranzactie;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
	
	DataGenerator generator;
	MersMicrobuze mers;
	List<Calator> calatori;
	Reduceri reduceri;
	List<Tranzactie> tranzactii;
	
	Controller()
	{
		generator = new DataGenerator();
		mers = generator.GetMersMicrobuze();
		calatori = generator.GetDateCalatori();
		reduceri = generator.GetReduceri();
		tranzactii = generator.GetTranzactii();
	}

	@GetMapping("/getCurse")
	public List<Cursa> curse() {
		return mers.getCurse();
	}
	
	@GetMapping("/getCurseStatie")
	public List<Cursa> programStatie(@RequestParam(value = "statie") String name) {
		List<Cursa> curseStatie = new ArrayList<>();
		List<Cursa> curseToate = mers.getCurse();
		
	    for (int i = 0; i < curseToate.size(); i++) {
	        Cursa cursa = curseToate.get(i);
	        List<Statie> statiiRuta = cursa.getRuta().getTraseu();

	        for (int j = 0; j < statiiRuta.size(); j++) {
	            Statie statie = statiiRuta.get(j);
	            if (statie.getNume().equalsIgnoreCase(name)) {
	                curseStatie.add(cursa);
	                break;
	            }
	        }
	    }

		return curseStatie;
	}
	
	@GetMapping("/programCursa")
	public List<Cursa> programCursa(@RequestParam(value = "statiePornire") String statie1
			, @RequestParam(value = "statieDestinatie") String statie2) {
		
		List<Cursa> curseProgramCursa = new ArrayList<>();
		List<Cursa> curseToate = mers.getCurse();
		
	    for (int i = 0; i < curseToate.size(); i++) {
	        Cursa cursa = curseToate.get(i);
	        List<Statie> statiiRuta = cursa.getRuta().getTraseu();
	        
	        boolean statieStart = false;
	        boolean statieFinal = false;
	        
	        for (int j = 0; j < statiiRuta.size(); j++) {
	            Statie statie = statiiRuta.get(j);
	            
	            if (statie.getNume().equalsIgnoreCase(statie1)) {
	            	statieStart = true;
	            }

	            if (statieStart && statie.getNume().equalsIgnoreCase(statie2)) {
	            	statieFinal = true;
	            }
	            
	            if (statieStart && statieFinal) {
		            curseProgramCursa.add(cursa);
		            break;
		        }
	        }
	    }
	    
		return curseProgramCursa;
	}
	
	@GetMapping("/getCalatori")
	public List<Calator> calatori() {
		return calatori;
	}
	
	private Calator existaCalator(String email)
	{
		for (int i = 0; i < calatori.size(); i++) {
	        Calator calator = calatori.get(i);
	        
	        if (calator.getEmail().compareToIgnoreCase(email)==0)
	        {
	        	return calator;
	        }
		}
		
		return null;
	}
	
	@PostMapping("/adaugaCalator")
	public ResponseEntity adaugaCalator(@RequestBody Calator calator) {
		if (existaCalator(calator.getEmail()) != null) {
			return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
		}
		else {
			calatori.add(calator);
			return ResponseEntity.ok(HttpStatus.OK);
		}
	}
	
	private Calator verificaUtilizator(String email, String parola) {
	    
		for (Calator calator : calatori) {
	        if (calator.getEmail().equalsIgnoreCase(email) && (calator.getParola().equals(parola))) {
	            return calator; 
	        }
	    }
	    
		return null; 
	}
	
	@PostMapping("/adaugaAbonament")
	public ResponseEntity adaugaAbonament(@RequestBody EmitereAbonament calator) {

		// daca utilizatorul nu exista sau parola nu e valida -> eroare
		Calator calatorActual = verificaUtilizator(calator.getEmail(), calator.getParola()); 
	    if (calatorActual == null) {
	        return  ResponseEntity.ok(HttpStatus.BAD_REQUEST);
	    }

		// daca valabilitatea nu e valoare valida -> eroare    
	    if (!verificaValabilitate(calator.getValabilitate())) {
	        return  ResponseEntity.ok(HttpStatus.BAD_REQUEST);
	    }
	    
		// calculam pretul (poate bazat pe categorie)
	    int pret = calculeazaPretAbonament(calatorActual, calator.getValabilitate());
	    Abonament abonament = new Abonament(
	    		calator.getPlecare(),
	    		calator.getSosire(),
	            pret,
	            calator.getStartData(),
	            calator.getValabilitate()
	    );
	    
	    calatorActual.AddAbonament(abonament);
	    return ResponseEntity.ok(HttpStatus.OK);
	}

	private boolean verificaValabilitate(Integer valabilitate) {
	    return (valabilitate > 7)&&(valabilitate < 31);
	}
	
	private int calculeazaPretAbonament(Calator calator, Integer valabilitate) {
	    int pret = (int) (8 * valabilitate);
		
		if (calator != null && calator.getCategoria() != null) {
	    	Categoria categoriaCalator = calator.getCategoria();
	       	String numeCategoria = categoriaCalator.getNume();
	       	
	       	Integer reducere = reduceri.getReduceri().get(numeCategoria);
	       	if (reducere != null)
	       	{
	       		pret = pret - (int)( (float)reducere / 100.0 * pret);
	       	}
	    }
		
		return pret;
	}
	
	@PostMapping("/adaugaCategorieCalator")
	public ResponseEntity adaugaCategorieCalator(@RequestBody DateCategorie categorie) {
		// daca utilizatorul nu exista sau parola nu e valida -> eroare
		Calator calatorActual = verificaUtilizator(categorie.getEmail(), categorie.getParola()); 
	    if (calatorActual == null) {
	        return  ResponseEntity.ok(HttpStatus.BAD_REQUEST);
	    }
	    
	    Categoria categoria = new Categoria(categorie.getNumeCategorie(), categorie.getIdLegitimatie());
	    calatorActual.setCategoria(categoria);
	    return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@GetMapping("/getTranzactii")
	 public List<Tranzactie> tranzactii() {
        return tranzactii;
    }
	
	@GetMapping("/getTranzactiiUtilizator")
	public List<Tranzactie> tranzactiiUtilizator(@RequestParam(value = "email") String email
			, @RequestParam(value = "parola") String parola) {
		
		List<Tranzactie> tranzactiiUtilizator = new ArrayList<Tranzactie>();
		
		Calator calatorActual = verificaUtilizator(email, parola);
	    if (calatorActual == null) {
	        return null;
	    }
	    
	    for(Tranzactie tranzactieCurenta : tranzactii)
	    {
	    	if(tranzactieCurenta.getCalator().equalsIgnoreCase(calatorActual.getCnp()))
	    	{
	    		tranzactiiUtilizator.add(tranzactieCurenta);
	    	}
	    }
		
		return tranzactiiUtilizator;
	}
	
	//emitereBilet
	//email, parola, idCursa, 
	@PostMapping("/emitereBilet")
	public ResponseEntity cumparaBilet(@RequestBody EmitereBilet bilet) {

	    Calator calatorActual = verificaUtilizator(bilet.getEmail(), bilet.getParola());
	    if (calatorActual == null) {
	        return ResponseEntity.ok(HttpStatus.BAD_REQUEST);
	    }

	    int pret = calculeazaPretBilet(calatorActual);
	    String timeStamp = new SimpleDateFormat("dd.MM.YYYY-HH:mm:ss").format(new java.util.Date());

	    Tranzactie tranzactie = new Tranzactie(calatorActual.getCnp(), bilet.getIdCursa()
	    		, pret, timeStamp);
	    tranzactii.add(tranzactie);

	    return ResponseEntity.ok(HttpStatus.OK);
	}
	
	private int calculeazaPretBilet(Calator calator) {
	    int pret = 8;
		
		if (calator != null && calator.getCategoria() != null) {
	    	Categoria categoriaCalator = calator.getCategoria();
	       	String numeCategoria = categoriaCalator.getNume();
	       	
	       	Integer reducere = reduceri.getReduceri().get(numeCategoria);
	       	if (reducere != null)
	       	{
	       		pret = pret - (int)( (float)reducere / 100.0 * pret);
	       	}
	    }
		
		return pret;
	}
}