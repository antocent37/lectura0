public class Circulo {

    private double radio;
    private Punto centro;

    public Circulo(Punto centro, double radio) {
        this.radio = radio;
        this.centro = centro;
    }

    public boolean intersectaCon(Circulo c2){
        return c2.getRadio()+this.getRadio() >= this.centro.distancia(c2.centro);
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

}