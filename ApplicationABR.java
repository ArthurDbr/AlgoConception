/**
 * Classe ApplicationABR : classe qui utilise des arbres binaires de recherche.
 *
 * @author Arthur Debar
 * @version 2018-03-15
 *
 */public class ApplicationABR {

	 /**
	  * Méthode principale de l'application utilisant des ABR.
	  * @param args : arguments de la méthode.
	  */
	 public static void main(String[] args) {
		 // Création d'un ABR contenant des chaînes de caractères
		 ABR<Integer> ABR = new ABR<Integer>();

		 // Vérification que l'arbre est vide
		 System.out.println(ABR.arbreVide());

		 System.out.println(ABR.ajoutValeur(3));
		 System.out.println(ABR.ajoutValeur(5));
		 System.out.println(ABR.ajoutValeur(5));

		 System.out.println(ABR.noeudPere(ABR.rechercheNoeud(5)));

	 }
}
