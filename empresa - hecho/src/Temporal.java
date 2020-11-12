public class Temporal extends Empleado {
    public static final double VALORHORA = 200;
    public Temporal(boolean casado, int hijos, double hsTrabajo) {
        super(casado, hijos, hsTrabajo);
    }


    @Override
    public double getSalario() {
        return super.getHorasTrabajadas() * Temporal.VALORHORA + super.getSalarioFamiliar();
    }
}
