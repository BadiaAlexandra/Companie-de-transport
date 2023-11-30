package ro.digitalnation.proiect;

import org.springframework.web.bind.annotation.RestController;

import dataobjects.Cursa;
import dataobjects.MersMicrobuze;
import dataobjects.Statie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller {
	
	DataGenerator generator;
	MersMicrobuze mers;
	
	Controller()
	{
		generator = new DataGenerator();
		mers = generator.GetMersMicrobuze();
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
}