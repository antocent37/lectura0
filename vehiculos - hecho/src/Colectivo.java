public class Colectivo extends Vehiculo {
    Persona pasajeros [];
    int cantPasajeros = 0;

    public Colectivo(Persona pers1, double km) {
        super(pers1, km);
        this.pasajeros = new Persona[15];
    }

    @Override
    public void cambiarChofer(Persona per1) {
        if (cantPasajeros == 0){
            this.setChofer(per1);
        } else {
            System.out.println("El chofer no puede cambiarse cuando tiene acompañante");
        }
    }

    @Override
    public void agregarAcompaniante(Persona per2) {
        if (this.cantPasajeros < 15) {
            pasajeros[cantPasajeros] = new Persona(per2.nombre);
            cantPasajeros++;
        } else {
            System.out.println("El colectivo esta lleno");
        }

    }


}
