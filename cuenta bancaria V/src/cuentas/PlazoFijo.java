package cuentas;

public class PlazoFijo {
    private Cuenta cta;
    private double dinero=0;

    public PlazoFijo(Cuenta cta) {
        this.cta = cta;

    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void realizarPlazoFijo(double dinero){
        cta.setSaldo(cta.getSaldo() - dinero);
        setDinero(dinero);
        cta.addMovimiento(dinero, "PLAZO FIJO REALIZADO");
    }
    public double efectivarPlazoFijo(){
        double aux = this.getDinero() + this.getDinero()*0.0292;
        cta.addMovimiento(aux, "PLAZO FIJO COBRADO");
        cta.setSaldo(aux);
        setDinero(0);
        return aux;
    }
}
