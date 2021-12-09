package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int min=1000;
		
		//rechercher de la valeur max
		for (int i=0; i<array.length; i++) {
			if (array[i]<=min) {
				min= array[i];
			}
		}
		
		//affichage de la valeur min
		System.out.println("valeur min: " + min);
	

	}

}
