package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {
		// Tests de verification
verifier(3, 1, 8, true);
verifier(3, 1, 9, false);
verifier(3, 2, 10, true);
verifier(3, 2, 8, true);
verifier(3, 1, 9, false);
verifier(3, 1, 8, true);
verifier(6, 1, 11, true);
verifier(6, 0, 11, false);
verifier(1, 4, 11, true);
verifier(0, 3, 10, true);
verifier(1, 4, 12, false);
verifier(1, 1, 7, false);

	}
	
	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		boolean resultat = false;
		for (int i=0; i<nbSmall; i++) {
			for (int j=0; j<nbBig; j++) {
				if ((i*nbSmall + j*nbBig)==longueur) {
					return true;
				}
			}
		}
		return resultat;
	}
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur)==b) {
			System.err.println("Test(" +nbSmall + "," + nbBig + "," + longueur + ") Non passant.");
		}
	}

}
