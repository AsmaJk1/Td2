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
