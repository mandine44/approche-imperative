package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int max=0;
		
		//rechercher de la valeur max
		for (int i=0; i<array.length; i++) {
			if (array[i]>=max) {
				max = array[i];
			}
		}
		
		//affichage de la valeur max
		System.out.println("valeur max: " + max);

	}

}
