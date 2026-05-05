/* STRUCTURE D'UNE CLASSE
class NomModele{

       // On definit les proprietes de la classe ici
       private/public type propriéte;

            *****************************
    CONSTRUCTEUR : fonction qui permet de créer un objet.
                   On y attribue les valeurs initiales aux propriétés

     Création d'un nouvel objet/Appel de constructeur :
     NomModele = new NomModele(... paramètre(s) ...) // on appelle la méthode qui est le constructeur;

     Structure d'un constructeur:
    public NomModele (... paramètre(s) ...)
    {
     this.propriéte = valeur_initial; // this = reference sur le nouvel objet + on regarde
                                                les propriétes definit en haut

     // A la fin du constructeur, cette reference est retournée
    }

            *****************************

    MUTATEUR (setter): Donne droit d'écriture à une donnée privée
    Syntaxe Mutateur: On desire modifier la valeur d'un attribut privée ...
                      et conserve la cohérence des autres attributs si nessecaire
    public void setNomPropriete (type nouvelleValeur)
    {
    this.nomPropriete = nouvelleValeur;

    //Ici on écrit la logique / calcul pour gerer la coherence

    }

            *****************************

    ACCESSEUR (getter): Donne un droit de lecture à une donnée privée
    Syntaxe Accesseur: On desire retourner une propriété privée
        public type get_nom_propriete()
        {
            return this_nom_propriete; // Retourne du même type que la propriete voulu
        }

            *****************************

    MÉTHODES DE SERVICE: fonction qui effectue des calculs ou une analyse

            *****************************
Override vs Overload (Base du polymorphime)
Ces 2 concepts permettent de modifier le comportement d'une fonction pré-existante
(redefinition) Override : Même nom de fonction + même liste de paramètres
           La modification est basée sur le type de la classe


(surcharge) Overload :Même nom de fonction + liste de paramètres différentes
           La modification est basé sur les données reçus

Surchage de méthode : Les API de Java utilise certaine méthode pour manipuler nos objets avec un comportement par defaut.
@Override // Doit avoir la meme structure et le nom exact de la fonction pré-existante
public type_prexistant nomPrexistant (... parametres ..._)
{
  **  Ecrit ton code pour changer le comportement **
}

Les opérateurs -> ne fonctionne pas sur les objets parce que l'on manipule leur référence
Compaer -> Méthode equals ** Override
Additionner -> Méthode add * Definition / Redefinition
Soustraction -> Méthode sub * Definition / Redefinition
Plus petit -> Méthode lt ** Override

Un exemple ,
@Override
public boolean equals (Object autre)
{
    On écrit la logique pour l'objet.
    || STEP 1 -> Verifier si l'objet existe ||
    || STEP 2 -> Verifier si le parametre est du bon type||
        Possible de vérifier le type avec getClass()
        Ne pas oublier type cast est possible et doit etre utiliser au besoin
    || STEP 3 -> Faire la comparaison ||

}

*/

// Exemple
class Vecteur
{
    // On definit les properties
    private double amplitude;
    private double orientation;
    private double dx;
    private double dy;

    // Constructeur
    public Vecteur (double force, double angle)
    {
        this.amplitude = force;
        this.orientation = angle;

        this.decomposer_vecteur();
    }
    private void decomposer_vecteur()
    {
        this.dx = this.amplitude * Math.cos(this.orientation);
        this.dy = this.amplitude * Math.sin(this.orientation);
    }

    // Getters
    public double getAmplitude()
    {
        return this.amplitude;
    }
    public double getAngle()
    {
        return this.orientation;
    }

    // Setters
    public void setAmplitude(double nouvelleForce)
    {
        this.amplitude=nouvelleForce;
        // Encapsulation -> on s'assure que la decomposition ce fait a chaque fois que l'on change
        this.decomposer_vecteur();
    }

    // Modificators
    @Override
    public String toString()
    {
        // on peut utiliser String.format("F= %5.2f N @ %1.4f rad, this.amplitude. this.orientation) -> même que C
        //String msg = String.format("F=" %5.2f "N @" %1.4f " rad", this.amplitude, this.orientation);
        String msg = "F= " + this.getAmplitude() + " N @ " + this.getAngle() + " rad";

        return msg;
    }
}

