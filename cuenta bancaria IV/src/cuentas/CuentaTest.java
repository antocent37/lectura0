package cuentas;

import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class CuentaTest {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void pruebaFuncionamientoCuentaCorriente() {
        Cuenta ctaCte = new CuentaCorriente(5000,1000);
        ctaCte.retirarDinero(3300);
        System.out.println(ctaCte.getSaldo());
        double actual = ctaCte.getSaldo();
        assertEquals(1700,actual,0.01);

    }
    @Test
    public void retiroDineroMayorAlSaldoCuentaCorriente() {
        Cuenta ctaCte = new CuentaCorriente(5000,1000);
        ctaCte.retirarDinero(6000);
        System.out.println(ctaCte.getSaldo());
        double actual = ctaCte.getSaldo();
        assertEquals(-1000,actual,0.01);

    }
    @Test
    public void pruebaFuncionamientoCajaDeAhorro() {
        CajaDeAhorro cAhorro = new CajaDeAhorro(5000,1000);
        System.out.println(cAhorro.getSaldo());
        cAhorro.reintegro();
        cAhorro.retirarDinero(1500);
        System.out.println(cAhorro.getSaldo());
        double actual = cAhorro.getSaldo();
        assertEquals(3500,actual,0.01);
    }

    @Test
    public void funcionamientoCorrectoTransaccion() {
        CajaDeAhorro miCuenta = new CajaDeAhorro(500,100);
        CuentaCorriente cuentaDestino = new CuentaCorriente(0, 500.0);

        cuentaDestino.ponerDinero(1000.0);
        cuentaDestino.retirarDinero(1250.0);
        cuentaDestino.retirarDinero(250.0);
        miCuenta.ponerDinero(2000);
        miCuenta.transferir(1500.0, cuentaDestino);
        //System.out.println(miCuenta.getSaldo());
        System.out.println(cuentaDestino.getSaldo());
        double actual = cuentaDestino.getSaldo();
        assertEquals(1000,actual,0.01);

    }
    @Test
    public void funcionamientoIncorrectoTransaccion(){
        CajaDeAhorro miCuenta = new CajaDeAhorro(500,100);
        CuentaCorriente cuentaDestino = new CuentaCorriente(1000, 500.0);
        System.out.println("El saldo es mi cuentas.Cuenta es: " + miCuenta.getSaldo());
        System.out.println("El saldo en la cuenta destino es: " + cuentaDestino.getSaldo());
        miCuenta.transferir(2000, cuentaDestino);
        System.out.println("El saldo en la cuenta destino despues de la transferencia: " + cuentaDestino.getSaldo());
    }
}
