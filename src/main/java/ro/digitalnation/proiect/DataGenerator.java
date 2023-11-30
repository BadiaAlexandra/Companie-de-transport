package ro.digitalnation.proiect;

import java.util.ArrayList;
import java.util.List;

import dataobjects.Cursa;
import dataobjects.MersMicrobuze;
import dataobjects.Program;
import dataobjects.Ruta;
import dataobjects.Statie;

// "mock" to generate some data - replace for a real SQL database
public class DataGenerator {
	
	public MersMicrobuze GetMersMicrobuze()
	{
		List<Cursa> curse = new ArrayList<Cursa>();
		
		Statie st1 = new Statie("Ologeni", "Ploiesti");
		Statie st2 = new Statie("Burias", "Bucuresti");
		Statie st3 = new Statie("Poienarii Burchii", "Ploiesti");
		Statie st4 = new Statie("Pod Valeni", "Ploiesti");
		Statie st5 = new Statie("Carbunari", "Ploiesti");
		Statie st6 = new Statie("Poienarii Apostoli", "Ploiesti");
		Statie st7 = new Statie("Gorgota", "Ploiesti");
		Statie st8 = new Statie("Potigrafu", "Ploiesti");
		Statie st9 = new Statie("Puchenii Mosneni", "Ploiesti");
		Statie st10 = new Statie("Puchenii Mari", "Ploiesti");
		Statie st11 = new Statie("Romanesti", "Ploiesti");
		Statie st12 = new Statie("Barcanesti", "Ploiesti");
		Statie st13 = new Statie("Gara Sud", "Ploiesti");
		Statie st14 = new Statie("Ciolpani", "Bucuresti");
		Statie st15 = new Statie("Tancabesti", "Bucuresti");
		Statie st16 = new Statie("Vladiceasca", "Bucuresti");
		Statie st17 = new Statie("Saftica", "Bucuresti");
		Statie st18 = new Statie("Otopeni", "Bucuresti");
		Statie st19 = new Statie("Gara Nord", "Bucuresti");
		
		
		List<Statie> statiiRuta1 = new ArrayList<Statie>();
		statiiRuta1.add(st1);
		statiiRuta1.add(st2);
		statiiRuta1.add(st3);
		statiiRuta1.add(st4);
		statiiRuta1.add(st5);
		statiiRuta1.add(st6);
		statiiRuta1.add(st7);
		statiiRuta1.add(st8);
		statiiRuta1.add(st14);
		statiiRuta1.add(st15);
		statiiRuta1.add(st16);
		statiiRuta1.add(st17);
		statiiRuta1.add(st18);	
		statiiRuta1.add(st19);	
		
		Ruta ruta1 = new Ruta(1, statiiRuta1);
	
		List<Statie> statiiRuta2 = new ArrayList<Statie>();
		statiiRuta2.add(st1);
		statiiRuta2.add(st2);
		statiiRuta2.add(st3);
		statiiRuta2.add(st4);
		statiiRuta2.add(st5);
		statiiRuta2.add(st6);
		statiiRuta2.add(st7);
		statiiRuta2.add(st8);
		statiiRuta2.add(st9);
		statiiRuta2.add(st10);
		statiiRuta2.add(st11);
		statiiRuta2.add(st12);
		statiiRuta2.add(st13);	
		
		Ruta ruta2 = new Ruta(2, statiiRuta2);
		
		List<Statie> statiiRuta3 = new ArrayList<Statie>();
		statiiRuta3.add(st13);
		statiiRuta3.add(st14);
		statiiRuta3.add(st15);
		statiiRuta3.add(st16);
		statiiRuta3.add(st17);
		statiiRuta3.add(st18);
		statiiRuta3.add(st19);
		
		Ruta ruta3 = new Ruta(3, statiiRuta3);
		
		List<Statie> statiiRuta4 = new ArrayList<Statie>();
		statiiRuta4.add(st8);
		statiiRuta4.add(st9);
		statiiRuta4.add(st10);
		statiiRuta4.add(st11);
		statiiRuta4.add(st12);
		statiiRuta4.add(st13);
		statiiRuta4.add(st14);
		statiiRuta4.add(st15);
		statiiRuta4.add(st16);
		statiiRuta4.add(st17);
		statiiRuta4.add(st18);
		statiiRuta4.add(st19);
		
		Ruta ruta4 = new Ruta(4, statiiRuta4);
		
		Program p1 = new Program(true, true, true, true, true, true, true);
		Cursa c1 = new Cursa(ruta1, 101, "6:45", "7:45", p1);
		curse.add(c1);
		
		Program p2 = new Program(false, false, false, false, false, true, true);
		Cursa c2 = new Cursa(ruta1, 102, "10:45", "11:45", p2);
		curse.add(c2); 
		
		Program p3 = new Program(true, true, true, true, true, false, false);
		Cursa c3 = new Cursa(ruta1, 103, "14:45", "15:45", p3);
		curse.add(c3); 
		
		Program p4 = new Program(true, true, true, true, true, true, true);
		Cursa c4 = new Cursa(ruta2, 104, "14:00", "15:45", p4);
		curse.add(c4); 
		
		Program p5 = new Program(true, true, true, true, true, false, false);
		Cursa c5 = new Cursa(ruta2, 105, "15:00", "16:45", p5);
		curse.add(c5);
		
		Program p6= new Program(false, false, false, false, false, true, true);
		Cursa c6 = new Cursa(ruta2, 106, "20:00", "21:45", p6);
		curse.add(c6);
		
		Program p7 = new Program(true, true, true, true, true, true, true);
		Cursa c7 = new Cursa(ruta3, 107, "8:00", "9:00", p7);
		curse.add(c7);
		
		Program p8 = new Program(true, true, true, true, true, false, false);
		Cursa c8 = new Cursa(ruta3, 108, "11:00", "12:00", p8);
		curse.add(c8);
		
		Program p9 = new Program(false, false, false, false, false, true, true);
		Cursa c9 = new Cursa(ruta3, 109, "15:30", "16:30", p9);
		curse.add(c9);
		
		Program p10 = new Program(true, true, true, true, true, true, true);
		Cursa c10 = new Cursa(ruta4, 110, "9:00", "9:55", p10);
		curse.add(c10);
		
		Program p11 = new Program(true, true, true, true, true, false, false);
		Cursa c11 = new Cursa(ruta4, 111, "7:00", "7:55", p11);
		curse.add(c11);
		
		Program p12 = new Program(false, false, false, false, false, true, true);
		Cursa c12 = new Cursa(ruta4, 112, "13:00", "13:55", p12);
		curse.add(c12);
		
		MersMicrobuze mers = new MersMicrobuze(curse);
		return mers;
	}

}
