package cuentas;

public class CuentaCorriente extends Cuenta {
    private double saldoDescubierto;

    public CuentaCorriente(double saldo, double descubierto){
        setSaldo(saldo);
        this.saldoDescubierto = descubierto;
    }
    public double getSaldoDescubierto() {
        return saldoDescubierto;
    }

    @Override
    public double retirarDinero(double platita) {
        try {
            if (super.getSaldo() + this.getSaldoDescubierto() >= platita){
                super.setSaldo(super.getSaldo() - platita);
                super.addMovimiento(platita, "EXTRACCION");
                return platita;
            }
            else throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
        }catch (DineroNoDisponibleException dnd){
            System.err.println(dnd.getMessage());
            return 0.0;
        }
    }


}


