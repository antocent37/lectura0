import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTestTest {

    public CirculoTestTest() {
    }

    @Test
    public void intersectaConTest() {
        Circulo c1 = new Circulo(new Punto(0, 0), 1);
        Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
        assertTrue("hay interseccion",c1.intersectaCon(c2));

    }

    @Test
    public void NoIntersectaConTest() {
        Circulo c1 = new Circulo(new Punto(-1, 3), 1);
        Circulo c2 = new Circulo(new Punto(5, 1), 2);
        assertFalse("No hay interseccion", c1.intersectaCon(c2));

    }
}