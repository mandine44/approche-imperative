package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		int somme=0;
		// Demande saisie d'un nombre entre 1 et 10 et le stocke dans nb
		do {
			System.out.println("Entrez un nombre entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb < 1 || nb > 10);

		//calcule la somme arithmetique
		for (int i=1; i<=nb; i++) {
			somme +=i;
		
		}
		System.out.println (somme);
	}

}
