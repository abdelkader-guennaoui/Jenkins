

import java.util.Arrays;

/**
 * Recherche d'un prénom dans un tableau et suppression de celui-ci 
 * On retourne le nouveau tableau sans le prénom.
 */

public class EvalRecherchePrenom {

	public static String[] recherche(String[] liste, String prenom) {

		int compteur = 0;             			
		for (int i=0; i < liste.length; i++ ) {
			if (liste[i].equals(prenom)) {     
				for ( int j = i; j < liste.length-1; j++) {
					liste[j] = liste[j+1];
				}
				i--;
				compteur++;
				liste[liste.length-compteur] = "";
			}
		}
		String[] newListe = new String[liste.length-compteur];
		for (int i = 0; i<newListe.length; i++) {
			newListe[i] = liste[i];
		}
		return newListe;
	}
	
	public static void main(String[] args) {
		String[] liste 	= {"pierre", "paul", "paul"};
		String prenom 	= "paul";
		System.out.println(Arrays.toString(recherche(liste, prenom)));
	}
}