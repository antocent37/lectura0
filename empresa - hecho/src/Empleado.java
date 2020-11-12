public abstract class Empleado {
    boolean esCasado;
    int hijos;
    double horasTrabajadas;


    public Empleado(boolean casado,int hijos,double hsTrabajo){
        this.esCasado = casado;
        this.hijos = hijos;
        this.horasTrabajadas = hsTrabajo;

    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }



    public double getSalarioFamiliar(){
        return  200*this.hijos + ((esCasado)?100:0);
    };
    public abstract double getSalario();
}
