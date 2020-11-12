public abstract class Instrumento {
    public String nombre;
    public String descripcion;

    public Instrumento(String nom, String descri){
        this.nombre = nom;
        this.descripcion = descri;
    }

    public abstract void tocar();
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDescripcion(String descri){
        this.descripcion=descri;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
