import java.util.Arrays;
import java.util.List;

/**
 * Solution exercice no1.
 */
public class Particule {
    private double px;
    private double py;
    private double vx;
    private double vy;

    private final double EPSILON = 0.001;

    public Particule(double px, double py, double vx, double vy){
        this.px = px;
        this.py = py;
        this.vx = vx;
        this.vy = vy;
    }


    /**
     * Solution exercice no2.
     */
    public double getPx(){
        return this.px;
    }

    public double getPy(){
        return this.py;
    }

    public double getVx(){
        return this.vx;
    }

    public double getVy(){
        return this.vy;
    }

    public void setPx(double px){
        this.px = px;
    }

    public void setPy(double py){
        this.py = py;
    }

    public void setVx(double vx){
        this.vx = vx;
    }

    public void setVy(double vy){
        this.vy = vy;
    }


    /**
     * Solution exercice no3.
     */
    public void avancer(double dt){
        this.px = this.px + this.vx * dt;
        this.py = this.py + this.vy * dt;
    }


    /**
     * Solution exercice no4.
     */
    public double tempsCollision(Particule autre){

        double deltaPx = autre.px - this.px;
        double deltaPy = autre.py - this.py;
        double deltaVx = this.vx  - autre.vx;
        double deltaVy = this.vy  - autre.vy ;


        if (deltaPx == 0)
            deltaPx = EPSILON;

        if (deltaPy == 0)
            deltaPy = EPSILON;

        if (deltaVx == 0)
            deltaVx = EPSILON;

        if (deltaVy == 0)
            deltaVy = EPSILON;

        double deltaTx = deltaPx / deltaVx;
        double deltaTy = deltaPy / deltaVy;

        if (Math.abs(deltaTx - deltaTy) <= EPSILON)
            return deltaTx;
        else
            return Double.NaN;
    }

    public List<Object> predireCollision(Particule autre){

        double px = Double.NaN;
        double py = Double.NaN;
        double dt = this.tempsCollision(autre);

        if (dt != Double.NaN) {
            px = this.px + this.vx * dt;
            py = this.py + this.vy * dt;
        }
        return Arrays.asList(px, py, dt);
    }
}
