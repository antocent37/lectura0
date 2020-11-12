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
        c.consultaDinero();
        c.sacarDinero(-200);
        c.consultaDinero();

    }
    @Test
    public void transferenciasTest() {
        Cuenta miCuenta = new Cuenta();
        Cuenta cuentaDestino = new Cuenta();
        miCuenta.ponerDinero(5000);
        miCuenta.consultaDinero();
        miCuenta.transferir(2000, cuentaDestino);
        miCuenta.consultaDinero();
        cuentaDestino.consultaDinero();
    }

}
