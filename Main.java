public class Main {
    public static void main(String[] args) {
        
        Magasin carrefour = new Magasin("1", "Carrefour", "Centre-Ville", 20);
        Magasin monoprix = new Magasin("2", "Monoprix", "Menzah 6", 20);

        
        Caissier caissier1 = new Caissier("c1", "Ali", "Tunis", 180, "Caisse 1");
        Vendeur vendeur1 = new Vendeur("v1", "Khaled", "Tunis", 160, 0.10);
        Responsable responsable1 = new Responsable("r1", "Samir", "Tunis", 170, 100);

        Caissier caissier2 = new Caissier("c2", "Sara", "Tunis", 200, "Caisse 2");
        Vendeur vendeur2 = new Vendeur("v2", "Maya", "Tunis", 160, 0.15);
        Vendeur vendeur3 = new Vendeur("v3", "Mouna", "Tunis", 170, 0.12);
        Responsable responsable2 = new Responsable("r2", "Nabil", "Tunis", 160, 150);

        
        carrefour.ajouterEmploye(caissier1);
        carrefour.ajouterEmploye(vendeur1);
        carrefour.ajouterEmploye(responsable1);

        monoprix.aj
