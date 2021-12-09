package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		
		//rotation à droite
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int temp = array1[0];
		for (int i = 0; i < array1.length-1; i++) {
			array1[i] = array1[i + 1];
		}
		array1[array1.length-1]= temp;
		
		//affichage 
				for (int i =0; i<array1.length; i++) {
					System.out.println(array1[i]);
				}
	}

}
