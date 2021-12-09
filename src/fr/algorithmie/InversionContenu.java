package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy= new int [array.length];

		//recopie des elements de array dans arrayCopy dans l'ordre inverse
		for (int i = 0; i < array.length; i++) {
			arrayCopy[arrayCopy.length-1-i]=array[i];
		}
		System.out.println();
		
		// affichage des 2 tableaux 
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}	
		System.out.println();
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
