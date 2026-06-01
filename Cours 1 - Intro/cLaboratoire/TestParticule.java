import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestParticule
{
    private final double PRECISION = 0.01;

    @Test
    public void TestExercice02()
    {
        Particule uneParticule = new Particule(10.2, 5.5, -3.1, 0.7);

        assertEquals(10.2, uneParticule.getPx(), PRECISION);
        assertEquals(5.50, uneParticule.getPy(), PRECISION);
        assertEquals(-3.1, uneParticule.getVx(), PRECISION);
        assertEquals(0.70, uneParticule.getVy(), PRECISION);



        uneParticule.setPx(1);
        uneParticule.setPy(2);
        uneParticule.setVx(3);
        uneParticule.setVy(4);

        assertEquals(1, uneParticule.getPx(), PRECISION);
        assertEquals(2, uneParticule.getPy(), PRECISION);
        assertEquals(3, uneParticule.getVx(), PRECISION);
        assertEquals(4, uneParticule.getVy(), PRECISION);
    }

    @Test
    public void TestExercice03()
    {
        Particule uneParticule = new Particule(3,4,1,2);
        uneParticule.avancer(0.1);
        assertEquals(3.1, uneParticule.getPx(), PRECISION);
        assertEquals(4.2, uneParticule.getPy(), PRECISION);
    }

    @Test
    public void TestExercice04()
    {
        Particule p1 = new Particule(0, 0, 1, 1);
        Particule p2 = new Particule(1, 1, 0, 0);
        double temps = p1.tempsCollision(p2);
        assertEquals(1.0, temps, PRECISION);

        p1 = new Particule(0, 0, 0.1, 1);
        p2 = new Particule(1, 1,   0, 0);
        temps = p1.tempsCollision(p2);
        assertEquals(Double.NaN, temps, PRECISION);

        p1 = new Particule(0, 0, 0, 1);
        p2 = new Particule(0, 1, 0, 0);
        temps = p1.tempsCollision(p2);
        assertEquals(1.0, temps, PRECISION);

        p1 = new Particule(0, 0, 1, 0);
        p2 = new Particule(1, 0, 0, 0);
        temps = p1.tempsCollision(p2);
        assertEquals(1.0, temps, PRECISION);
    }

    @Test
    public void TestExercice05()
    {
        Particule p1 = new Particule(0, 0, 1, 1);
        Particule p2 = new Particule(1, 1, 0, 0);
        List<Object> liste = p1.predireCollision(p2);
        assertIterableEquals(Arrays.asList(1.0,1.0,1.0), liste);

        assertEquals(0, p1.getPx());
        assertEquals(0, p1.getPy());
        assertEquals(1, p2.getPx());
        assertEquals(1, p2.getPy());


        p1 = new Particule(0, 0, 0, 1);
        p2 = new Particule(1, 1, 0, 0);
        liste = p1.predireCollision(p2);
        assertIterableEquals(Arrays.asList(Double.NaN, Double.NaN, Double.NaN), liste);
    }
}
