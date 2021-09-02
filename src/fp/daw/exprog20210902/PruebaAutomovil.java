package fp.daw.exprog20210902;

import java.util.*;

public class PruebaAutomovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automovil automovil1 = new Automovil("Peugeot", "407", "9999", 2015, 100);
		Automovil automovil2 = new Automovil("Toyota", "Yaris", "0000", 2013, 90);
		Automovil automovil3 = new Automovil("Citroen", "C4", "1111", 2017, 150);

		Set<Automovil> misAutos = new HashSet<Automovil>();

		misAutos.add(automovil1);
		misAutos.add(automovil2);
		misAutos.add(automovil3);

		for (Automovil automovil : misAutos) {

			System.out.println(automovil);

		}

	}

}
