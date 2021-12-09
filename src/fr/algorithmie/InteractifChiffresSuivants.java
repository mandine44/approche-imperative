package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		do {
			System.out.println("Entrez un nombre entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb < 1 || nb > 10);

		for (int i=nb+1; i<=nb+10; i++) {
			System.out.println (i);
		}
	}

}
