public class Application {
    public Object[][] chargerDonneesExercices() {
        return new Object[][] {
            {"Course", 10.0, 4},
            {"Vélo", 8.0, 3},
            {"Natation", 11.0, 5},
            {"Marche", 4.0, 2},
            {"Rameur", 9.0, 4}
        };
    }

    public Object[][] chargerDonneesSeances() {
        return new Object[][] {
            {"Cardio léger", "Marche", 20, "Course", 15, null, 0},
            {"Endurance", "Vélo", 45, "Course", 20, null, 0},
            {"Mixte", "Natation", 25, "Rameur", 15, "Marche", 10}
        };
    }

    public static void main(String[] args) {
        Application app = new Application();
        Object[][] donneesExercices = app.chargerDonneesExercices();
        Object[][] donneesSeances = app.chargerDonneesSeances();


        System.out.println("===== RÉSUMÉ DE L'ATHLÈTE =====");
        System.out.println("... todo ...");
        System.out.println("");

        System.out.println("===== DÉTAIL DES SÉANCES =====");
        System.out.println("... todo ...");
        System.out.println("");
    }
}
