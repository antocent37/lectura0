package cuentas;

import java.util.ArrayList;

public abstract class Cuenta {
    double saldo=0;
    private ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();


    //tranferencias
    public void transferir(double montoTransfer, Cuenta cajaDestino) {
        try {
            if (montoTransfer > 0 && this.getSaldo() >= montoTransfer) {
                System.out.println("Transfiriendo.....");
                cajaDestino.ponerDinero(this.retirarDinero(montoTransfer));
                addMovimiento(montoTransfer,"TRANSFERENCIA");
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
            addMovimiento(platita, "DEPOSITO");
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

    //Agregar Movimientos
    protected void addMovimiento (double monto, String motivo){
        movimientos.add(new Movimiento(monto,motivo));
    }
    //recorrer Movientos
    public void recorrerMovimientos(){
        for (Movimiento mov: movimientos) {
            System.out.println(mov);
        }
    }
    //pagar con tarjeta de debito
    public void pagarDebito(double monto){
        try {
            if (monto > 0 && this.getSaldo() >= monto) {
                this.setSaldo(this.getSaldo() - monto);
                addMovimiento(monto,"DEBITO");
            } else
                throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
        }catch (DineroNoDisponibleException dnd){
            System.err.println(dnd.getMessage());
        }
    }
    //pagar con tarjeta de debito
    public void pagarCredito(double monto){
        try {
            if (monto > 0 && this.getSaldo() >= monto) {
                this.setSaldo(this.getSaldo() - monto);
                addMovimiento(monto,"PAGO VENCIMIENTO DEL CREDITO");
            } else
                throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
        }catch (DineroNoDisponibleException dnd){
            System.err.println(dnd.getMessage());
        }
    }
}
