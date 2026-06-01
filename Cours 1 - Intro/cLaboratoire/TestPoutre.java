import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoutre
{
    private final double PRECISION = 0.01;

    @Test
    public void TestExercice02()
    {
        PoutreRectangulaire unePoutre = new PoutreRectangulaire(4, 6, 0.5);

        assertEquals(4.0, unePoutre.getBase());
        assertEquals(6.0, unePoutre.getHauteur());
        assertEquals(0.5, unePoutre.getEpaisseur());
    }

    @Test
    public void TestExercice03()
    {
        PoutreRectangulaire unePoutre = new PoutreRectangulaire(10, 10, 1);
        assertEquals(492.0, unePoutre.getInertie());

        unePoutre.setBase(7);
        assertEquals(370.0, unePoutre.getInertie());
    }
}
