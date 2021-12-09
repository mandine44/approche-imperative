package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		
		//affichage des nombres de 1 à 10 inclu
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//affichage des nombres pairs de 0 à 10 inclu
		for (int i=0; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//affichage des nombres impairs de 1 à  9 inclu
		for (int i=1; i<=9; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//affichage des nombres de 1 à 10 inclu
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		//affichage des nombres pairs de 0 à 10 inclu
		i=0;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println();
		
		//affichage des nombres impairs de 1 à  9 inclu
		i=1;
		while(i<=9) {
			System.out.println(i);
			i+=2;
		}

	}

}
