package objets;

public class Chaudron {
    private int quantite; // Nombre de doses de potion dans le chaudron

    public Chaudron() {
        this.quantite = 0; // Par défaut, le chaudron est vide
    }

    public boolean restePotion() {
        return quantite > 0; // Retourne vrai si le chaudron contient de la potion
    }

    public void remplir(int dose) {
        this.quantite += dose; // Ajoute des doses de potion au chaudron
    }
}
