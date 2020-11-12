package cuentas;

public class TarjetaCredito {
    private Cuenta cta;
    private double gastoAcumulado=0;

    public TarjetaCredito(Cuenta cta) {
        this.cta = cta;
    }

    public double getGastoAcumulado() {
        return gastoAcumulado;
    }

    public void setGastoAcumulado(double compras) {
        this.gastoAcumulado += compras;
    }
    public void compra(double monto){
       setGastoAcumulado(monto);
       cta.addMovimiento(monto,"COMPRA A CREDITO");
    }
    public void pagarVencimiento(){
        cta.pagarCredito(this.getGastoAcumulado() + this.getGastoAcumulado()*0.03);
    }
}
