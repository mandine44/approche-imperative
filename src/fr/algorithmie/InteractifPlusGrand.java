package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		int max=0;
		
		// demande la saisie de 10 nombres
		
		for (int i=0; i<10; i++) {
		
			System.out.println("Entrez un nombre entre 1 et 10");
			nb = scanner.nextInt();
			if (nb>max) {max = nb;}
		} 
		
		//affiche le max des 10 nombres
			System.out.println (max);
		

	}

}
