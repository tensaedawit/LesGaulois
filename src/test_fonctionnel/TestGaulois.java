package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        // Cr�ation des instances
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 16);
        Romain minus = new Romain("Minus", 6);

        // Faire parler les personnages
        asterix.parler("Bonjour Ob�lix.");
        obelix.parler("Bonjour Ast�rix. �a te dirait d'aller chasser des sangliers ?");
        asterix.parler("Oui tr�s bonne id�e.");

        // Rencontre avec le romain Minus
        System.out.println("Dans la for�t " + asterix + " et " + obelix + " tombent nez � nez sur le romain " + minus.getNom() + ".");

        // Baston : Ast�rix frappe Minus 3 fois
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}
