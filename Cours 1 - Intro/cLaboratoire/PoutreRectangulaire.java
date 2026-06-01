/**
 * Solution exercice no1.
 */
public class PoutreRectangulaire {
    private double base;
    private double hauteur;
    private double epaisseur;
    private double inertie;

    public PoutreRectangulaire(double b, double h, double e){
        this.base = b;
        this.hauteur = h;
        this.epaisseur = e;
        this.calculerInertie();
    }

    /**
     * Solution exercice no2.
     */
    public double getBase(){
        return this.base;
    }

    public double getHauteur(){
        return this.hauteur;
    }

    public double getEpaisseur(){
        return this.epaisseur;
    }

    public double getInertie(){
        return this.inertie;
    }


    /**
     * Solution exercice no3.
     */
    public void setBase(double base){
        this.base = base;
        this.calculerInertie();
    }

    public void setHauteur(double hauteur){
        this.hauteur = hauteur;
        this.calculerInertie();
    }

    public void setEpaisseur(double epaisseur){
        this.epaisseur = epaisseur;
        this.calculerInertie();
    }

    private void calculerInertie()
    {
        double b = this.base    - 2*this.epaisseur;
        double h = this.hauteur - 2*this.epaisseur;

        this.inertie = (1.0/12)*(this.base*Math.pow(this.hauteur, 3) - (b*Math.pow(h, 3)));
    }
}
