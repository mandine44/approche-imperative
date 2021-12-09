package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		//affichage des nombres de 1 à 10
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// Affichage de mon nom 20 fois
		for (int i =1; i<=20; i++) {
			System.out.println("Amandine Huret");
		}
		System.out.println();
		
		//affichage des valeurs paires entre 1 et 100
		for (int i =2; i<=100; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//affichage des valeurs impaires entre 1 et 100
		for (int i =1; i<=99; i+=2) {
			System.out.println(i);
		}
		

	}

}
