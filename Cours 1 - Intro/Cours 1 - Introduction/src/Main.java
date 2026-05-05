/* COURS 1 - Introduction
Programmation orientée objet : On tente de modéliser des concepts courant dans une classe
Classe: On décrit de façon générique un modèle.
Propriétés/attributs: Ce sont les derniers du modèle
Méthodes: Ce sont les fonctions qui modélise le comportement de la classe
*****************************
Public : Les éléments publics sont accessibles partout dans l'application
Private : Les éléments privates privées sont accessibles dans la classe qui les définits.
*****************************
Objet/Instance: Représentation spécifique du modèle
*****************************
Encapsulation: On désire conserver une coherence entre tous les attributs d'une classe
               Par design, tous les attributs seront private
               Pour manipuler l'objet, on passe par des methodes et on code la logique de cohérence
*****************************
NORME JAVA : CAMEL CASE
*****************************
*/
/*   STRUCTURES D'UN MAIN
// C'est la structure d'un main (faire attention au indentations + accolades)
class nomFichier // DOIT ÊTRE LE MEME NOM QUE LE FICHIER
{
    public static void main (String[] args)
    {

    }
}
*/

// Exemple
class Main
{
    public static void main (String[] args)
    {
        Vecteur v1 = new Vecteur(100,Math.PI/6);
        Vecteur v2 = new Vecteur(100,Math.PI/4);
        Vecteur v3 = new Vecteur(50.5,Math.PI/2);


       /*
       Print l'adresse memoire (SI NON MODIFIER par override)
       System.out.println(v1);
       System.out.println(v2);
        */

       /* Print (peut etre éviter avec @Override)
        System.out.println("F= " + v1.getAmplitude()+ "N @ " + v1.getAngle() + " rad");
        System.out.println("F= " + v2.getAmplitude()+ "N @ " + v2.getAngle() + " rad");

        // Ici on utilise un setter pour changer la valeur de l'amplitude de v1,
        v1.setAmplitude(50);
        System.out.println("F= " + v1.getAmplitude()+ "N @ " + v1.getAngle() + " rad");

        */
        // Avec le override
        System.out.println(v1);
        System.out.println(v2);

    }

}
