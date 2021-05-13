package Package_ZEMIS;

public class FonctionCompteur {
	public int count (int x) {
	// TODO check that x > 0 and <= 255
		if (x > 255) 
			throw new RuntimeException("x doit être compis entre 1 et 255");
			
		// TODO calculer la somme de 1 à x
		int Nbre = 0;
		for (int i = 1; i <= x; i++) {
			Nbre += i;
		}
		return Nbre;
	}
}
