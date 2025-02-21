package personnages;
public class Main {
    public static void main(String[] args) {
        // Création des objets Gaulois et Romain
        Gaulois asterix = new Gaulois("Astérix", 10);
        Romain caesar = new Romain("César", 15);
        
        // Appel de la méthode parler
        asterix.parler("Salut, Romain!");
        caesar.parler("Je vais conquérir ce village !");
    }
}
