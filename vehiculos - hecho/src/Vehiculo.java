public abstract class Vehiculo {
    Persona chofer;
    double odometro;

    public Vehiculo(Persona pers1, double km){
        this.chofer = pers1;
        this.odometro = km;
    }
    public Persona getChofer(){
        return this.chofer;
    }
    public void setChofer(Persona pers1){
        this.chofer=(pers1);
    }

    public abstract void cambiarChofer(Persona per1);

    public abstract void agregarAcompaniante(Persona per2);
}
