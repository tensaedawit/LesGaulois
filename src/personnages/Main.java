package personnages;
public class Main {
    public static void main(String[] args) {
        // Cr�ation des objets Gaulois et Romain
        Gaulois asterix = new Gaulois("Ast�rix", 10);
        Romain caesar = new Romain("C�sar", 15);
        
        // Appel de la m�thode parler
        asterix.parler("Salut, Romain!");
        caesar.parler("Je vais conqu�rir ce village !");
    }
}
