public class Motocicleta  extends Vehiculo{
    Persona acompaniante;

    public Motocicleta(Persona pers1, double km, Persona acompa) {
        super(pers1, km);
        this.acompaniante = acompa;
    }

    @Override
    public void cambiarChofer(Persona per1) {
        if (this.acompaniante == null){
            this.setChofer(per1);
        } else {
            System.out.println("El chofer no puede cambiarse cuando tiene acompañante");
            System.out.println("El acompañante es: " + this.acompaniante);
        }
    }

    @Override
    public void agregarAcompaniante(Persona per2) {
        if (this.acompaniante == null){
            this.agregarAcompaniante(per2);
        } else {
            System.out.println("ya existe un acompañante");
        }
    }
}
