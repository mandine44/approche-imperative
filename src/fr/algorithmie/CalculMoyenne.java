package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int somme=0, moyenne = 0;
		
		//calcul de la somme des elements du tableau
		for (int i=0; i<array.length; i++) {
			somme += array[i];
		}
		
		//calcul de la moyenne
		moyenne = somme/array.length;
		
		//affichage de la moyenne
		System.out.println("la moyenne du tableau est "+ moyenne);

	}

}
