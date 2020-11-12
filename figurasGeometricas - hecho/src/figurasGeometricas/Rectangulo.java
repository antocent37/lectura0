package figurasGeometricas;

public class Rectangulo extends Figure {
    private Punto p2;

    public Rectangulo(Punto ubi, String color, Punto p2) {
        super(ubi, color);
        this.p2 = p2;
    }

    @Override
    public double getArea() {
        double base = Math.abs(super.getUbicacion().getX()-this.p2.getX());
        double altura = Math.abs(super.getUbicacion().getY()-this.p2.getY());
        return base * altura;

    }

    @Override
    public Punto getUbicacion() {
        return super.getUbicacion();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void mover(double deltaX, double deltaY) {
            super.getUbicacion().mover(deltaX,deltaY);
            this.p2.mover(deltaX,deltaY);
    }

    @Override
    public void compararArea(Figure otraFigura) {
        if (this.getArea() > otraFigura.getArea()){
            System.out.println("mi area es mayor");
        } else {
            System.out.println("su area es mayor que la mia");
        }
    }
}
