package figurasGeometricas;

public class Punto implements Movible {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {

        this(0,0);
    }

    public double distancia(Punto otroPunto) {
        return Math.sqrt((Math.pow(this.getX() - otroPunto.getX(), 2) +
                Math.pow(this.getY() - otroPunto.getY(), 2)));
    }

    public void mover(double deltaX, double deltaY) {
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + deltaY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
