package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		int[] somme = new int [Math.max(array.length, array2.length)];
		
		//addition des 2 tableaux
		for (int i =0; i<somme.length; i++) {
			if (i<array2.length) {
			somme[i]=array[i]+array2[i];
			} else somme[i] = array[i];
		}
		
		//affichage du resultat
		for (int i =0; i<somme.length; i++) {
			System.out.println(somme[i]);
		}
	}

}
