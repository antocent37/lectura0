package figurasGeometricas;

public abstract class Figure implements Movible, Comparable{
    private Punto ubicacion;
    private String color;

    public Figure(Punto ubi, String color){
        this.ubicacion = ubi;
        this.color = color;
    }

    public abstract double getArea();

    public Punto getUbicacion(){
        return ubicacion;
    }

    public String getColor(){
        return this.color;
    }


}

