package cuentas;

public abstract class Cuenta {
    double saldo=0;

    /*public cuentas.Cuenta(double saldo) {
        this.saldo = saldo;
    }*/

    //tranferencias
    public void transferir(double montoTransfer, Cuenta cajaDestino) {
        try {
            if (montoTransfer > 0 && this.getSaldo() >= montoTransfer) {
                System.out.println("Transfiriendo.....");
                cajaDestino.ponerDinero(this.retirarDinero(montoTransfer));
            } else
                throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
        }catch (DineroNoDisponibleException dnd){
            System.err.println(dnd.getMessage());
        }
    }

    // agregar saldo a la cuenta, siempre recibe saldo positivo
    public void ponerDinero(double platita){
        if (platita > 0)
            setSaldo(getSaldo() + platita);
    }
    //retirarDinero
    public abstract double retirarDinero(double platita);
    // setter monto
    public void setSaldo(double platita){
         this.saldo = platita;
    }
    // getter monto
    public double getSaldo(){
        return this.saldo;
    }




}
