package personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void recevoirCoup(int forceCoup) {
        force -= forceCoup;
        if (force > 0) {
            System.out.println("Le Romain " + nom + " : \"A�e\"");
        } else {
            System.out.println("Le Romain " + nom + " : \"J'abandonne !\"");
        }
    }
}
