import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VehiculotTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }
    //se suben pasajeros y no puede cambiar de chofer
    @Test
    public void NoSePuedeCambiarChoferColectivo(){
        Persona per1 = new Persona("Antonio");
        Persona per3 = new Persona("Antonio3");
        Persona per4 = new Persona("Antonio4");
        Persona per2 = new Persona("Lucio");
        Colectivo cole1 = new Colectivo(per1,250);
        System.out.println("El chofer es: " + cole1.getChofer());
        cole1.agregarAcompaniante(per3);
        cole1.agregarAcompaniante(per4);
        System.out.println("Hay " + cole1.cantPasajeros + " personas en el cole");
        cole1.cambiarChofer(per2);
        System.out.println("El chofer es: " + cole1.getChofer());
    }
    //no hay pasajeros, se puede cambiar de chofer
    @Test
    public void SePuedeCambiarChoferColectivo(){
        Persona per1 = new Persona("Antonio");
        Persona per2 = new Persona("Lucio");
        Colectivo cole1 = new Colectivo(per1,250);
        System.out.println("El chofer es: " + cole1.getChofer());
        System.out.println("Hay " + cole1.cantPasajeros + " personas en el cole");
        cole1.cambiarChofer(per2);
        System.out.println("El chofer es: " + cole1.getChofer());
    }
    //el motociclista tiene acompañante, no se puede cambiarse el chofer
    @Test
    public void NosePuedeCambiarChoferMotocicleta(){
        Persona per1 = new Persona("Antonio");
        Persona per2 = new Persona("Lucio");
        Vehiculo moto = new Motocicleta(per1,10,per2);
        System.out.println("La moto la maneja: " + moto.getChofer());
        moto.cambiarChofer(per2);
    }
    //no tiene acompañante, se puede cambiar de chofer
    @Test
    public void SePuedeCambiarChoferMotocicleta(){
        Persona per1 = new Persona("Antonio");
        Persona per2 = new Persona("Lucio");
        Vehiculo moto = new Motocicleta(per1,10,null);
        System.out.println("La moto la maneja: " + moto.getChofer());
        moto.cambiarChofer(per2);
        System.out.println("La moto ahora la maneja: " + moto.getChofer());
    }

}