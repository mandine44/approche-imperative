package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
	int tabEntiers[]={1,2,3,4,5,6,7,8,9,10};
	
	//affichage de la premiere valeur
	System.out.println(tabEntiers[0]);
	
	//affichage de la taille du tableau
	System.out.println(tabEntiers.length);
	
	//affichage de la derniere valeur
	System.out.println(tabEntiers[tabEntiers.length-1]);
	
	//modification et affichage de la valeur dont l index est 4
	tabEntiers[4]=8;
	System.out.println(tabEntiers[4]);
	}

}
