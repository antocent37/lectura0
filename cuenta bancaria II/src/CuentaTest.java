import org.junit.Before;
import org.junit.Test;


public class CuentaTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void pruebaFuncionamientoCuenta(){
        Cuenta c = new Cuenta();
        c.ponerDinero(1000);
        System.out.println(c.getSaldo());
        c.sacarDinero(-200);
        System.out.println(c.getSaldo());

    }

}
