package personnages;

public class Gaulois {
    private String nom;
    private int force;

    public Gaulois(String nom,int force) {
    	this.nom =nom;
    	this.force=force;
    }

    @Override
    public String toString() {
        return nom; 
    }
    
    public void parler(String message) {
        System.out.println("Le Gaulois " + nom + " : \"" + message + "\"");
    }

    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(force / 3);
    }
}
