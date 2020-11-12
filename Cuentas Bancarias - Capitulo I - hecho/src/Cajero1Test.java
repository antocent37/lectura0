import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Cajero1Test {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void constructorTest(){
        Cajero1 c = new Cajero1();
        c.ponerDinero(500);
        //valorActual= es el que trae la variable
        double valorActual = c.getMonto();
        //ValorEsperado= es el resultado que deberiamos tener
        float valorEsperado = 500;
        // delta: 0.001 le damos el margen de error
        assertEquals(valorActual, valorEsperado, 0.001);

    }
    @Test
    public void transferenciasTest() {
        Cajero1 miCuenta = new Cajero1();
        Cajero1 cuentaDestino = new Cajero1();
        miCuenta.ponerDinero(5000);
        miCuenta.consultaDinero();
        miCuenta.transferir(2000, cuentaDestino);
        miCuenta.consultaDinero();
        cuentaDestino.consultaDinero();
    }
}