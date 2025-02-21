package personnages;
import objets.Chaudron;

public class Druide {
    private String nom;
    private int forcePotion;
    private Chaudron chaudron;

    public Druide(String nom, int forcePotion, Chaudron chaudron) {
        this.nom = nom;
        this.forcePotion = forcePotion;
        this.chaudron = chaudron;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println("Le Druide " + nom + " : \"" + texte + "\"");
    }

    public void fabriquerPotion(int doses, int force) {
        this.forcePotion = force;
        chaudron.remplir(doses);
        parler("J'ai concoct� " + doses + " doses de potion magique. Elle a une force de " + force + ".");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (!chaudron.restePotion()) {
            parler("D�sol�, je n'ai plus de potion.");
            return;
        }
        if (gaulois.getNom().equals("Ob�lix")) {
            parler("Non, Ob�lix Non !... Et tu le sais tr�s bien !");
        } else {
            gaulois.setEffetPotion(forcePotion);
            parler("Tiens " + gaulois.getNom() + ", bois cette potion !");
        }
    }
}
