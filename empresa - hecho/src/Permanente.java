public class Permanente extends Empleado {
    int antiguedad;
    public static final double VALORAANTIGUEDAD = 100;
    public static final double VALORHORA = 300;

    public Permanente(boolean casado, int hijos, double hsTrabajo, int anti) {
        super(casado, hijos, hsTrabajo);
        this.antiguedad = anti;


    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public double getSalario() {
        return this.getHorasTrabajadas() * Permanente.VALORHORA + Permanente.VALORAANTIGUEDAD * this.antiguedad + super.getSalarioFamiliar();
    }
}
