public class Gerente extends Permanente {
    public static final double VALORAANTIGUEDAD = 150;
    public static final double VALORHORA = 400;
    public Gerente(boolean casado, int hijos, double hsTrabajo,int anti) {
        super(casado, hijos, hsTrabajo,anti);
    }

    @Override
    public double getSalario() {
        return super.getHorasTrabajadas() * Gerente.VALORHORA + Gerente.VALORAANTIGUEDAD * super.getAntiguedad() + super.getSalarioFamiliar();
    }
}
