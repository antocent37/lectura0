package figurasGeometricas;

public class Elipse extends Figure{

    private Double a;
    private Double b;

    public Elipse(Punto ubi, String color, double a, double b) {
        super(ubi, color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b * Math.PI; // formula: AreaElipse = a * b * pi
    }

    @Override
    public void mover(double deltaX, double deltaY) {
        super.getUbicacion().mover(deltaX,deltaY);
    }

    @Override
    public String getColor() {
        return "El color de la elipse es " + super.getColor();
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

