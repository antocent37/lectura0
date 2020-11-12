public class Persona implements Comparable<Persona>{
    public String nombre;
    public int altura;
    public int edad;

    public Persona(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona pers) {
        int resultado = 0;
        //if (this.altura < pers.altura) // ordenar por altura
          //  return -1;
        //else if (this.altura > pers.altura)
           // return 1;
        //else
        if (this.edad < pers.edad)
            return -1;
        else if (this.edad > pers.edad)
            return 1;
        else
            resultado = 0;
        return resultado;
    }

    @Override
    public String toString() {
        return nombre + " " + altura + " " + edad ;

    }
}
