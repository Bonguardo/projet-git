package Package_ZEMIS;

import java.util.HashMap;

public class ProgrammePrincipal {
	public static void main(String[] args) {

		HashMap<String,PersonneZemis> map = new HashMap<>();
		map.put("500", new PersonneZemis("500", "Bonguardo", "Maryse","29.25.1968", "F"));
		map.put("600", new PersonneZemis("600", "Bonguardo", "Patrick","13.09.1966", "M"));

		System.out.println("la taille de HashMap est : " + map.size());
	 
		System.out.println("Les employes sont : "  + map.values());

		PersonneZemis emp1 = map.get("500");
		System.out.println("Employe associé au clé 4 est  " + emp1);

		PersonneZemis emp2 = map.get("600");
		System.out.println("Employe associé au clé 4 est  " + emp2.getPrenom());
		/*
		if (map.containsKey(4)) {
			PersonneZemis emp = map.get(4);
			System.out.println("Employe associé au clé 4 est  " + emp);
	 */
	 
	}
}