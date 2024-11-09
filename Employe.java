class Employe {
    private String id;
    private String nom;
    private String adresse;
    private double heuresParMois;

    
    public Employe(String id, String nom, String adresse, double heuresParMois) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.heuresParMois = heuresParMois;
    }

    
    public double calculerSalaire() {
        return 0; 
    }

    
    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public double getHeuresParMois() { return heuresParMois; }
}
class Caissier extends Employe {
    private String numeroDeCaisse;

    public Caissier(String id, String nom, String adresse, double heuresParMois, String numeroDeCaisse) {
        super(id, nom, adresse, heuresParMois);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = getHeuresParMois() * 10; // Salaire normal
        if (getHeuresParMois() > 180) {
            salaire += (getHeuresParMois() - 180) * 10 * 0.15; // 15% pour heures supplémentaires
        }
        return salaire;
    }

    public String getNumeroDeCaisse() {
        return numeroDeCaisse;
    }
            }
class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(String id, String nom, String adresse, double heuresParMois, double tauxDeVente) {
        super(id, nom, adresse, heuresParMois);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente; // Salaire fixe * taux de vente
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }
}
class Responsable extends Employe {
    private double prime;

    public Responsable(String id, String nom, String adresse, double heuresParMois, double prime) {
        super(id, nom, adresse, heuresParMois);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = getHeuresParMois() * 10;
        if (getHeuresParMois() > 160) {
            salaire += (getHeuresParMois() - 160) * 10 * 0.20; // 20% pour heures supplémentaires
        }
        return salaire + prime;
    }

    public double getPrime() {
        return prime;
    }
            }
import java.util.ArrayList;
import java.util.List;

class Magasin {
    private String id;
    private String nom;
    private String adresse;
    private int capacite;
    private List<Employe> employes;

    public Magasin(String id, String nom, String adresse, int capacite) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        if (employes.size() < capacite) {
            employes.add(e);
        }
    }

    public void afficherDetails() {
        System.out.println("Magasin: " + nom + " - " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Employés:");
        for (Employe employe : employes) {
            System.out.println("- " + employe.getNom() + " (" + employe.getClass().getSimpleName() + ") - Salaire: " + employe.calculerSalaire() + " DT");
        }
    }
            }
    
