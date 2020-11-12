package cuentas;

public class TarjetaDebito {
    private Cuenta cuenta;

    public TarjetaDebito(Cuenta cta) {
        cuenta = cta;
    }
    public void compra(double monto){
        cuenta.pagarDebito(monto);
    }
}
