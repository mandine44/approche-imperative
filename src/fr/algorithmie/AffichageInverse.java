package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy= new int [array.length];
		
		//affichage du tableau array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		//affichage du tableau dans l'ordre inverse
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		//recopie des elements de array dans arrayCopy
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i]=array[i];
		}
		System.out.println();
		
		// affichage du tableau arrayCopy
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
