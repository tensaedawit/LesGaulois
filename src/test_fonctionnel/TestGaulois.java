package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        // Création des instances
        Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Romain minus = new Romain("Minus", 6);

        // Faire parler les personnages
        asterix.parler("Bonjour Obélix.");
        obelix.parler("Bonjour Astérix. Ça te dirait d'aller chasser des sangliers ?");
        asterix.parler("Oui très bonne idée.");

        // Rencontre avec le romain Minus
        System.out.println("Dans la forêt " + asterix + " et " + obelix + " tombent nez à nez sur le romain " + minus.getNom() + ".");

        // Baston : Astérix frappe Minus 3 fois
        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }
    }
}
