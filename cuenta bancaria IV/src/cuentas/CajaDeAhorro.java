package cuentas;

public class CajaDeAhorro extends Cuenta {
    private double saldoSecundario;
    public CajaDeAhorro(double saldo, double secundario) {
        setSaldo(saldo-secundario);
        this.saldoSecundario = secundario;
    }

    public double getSaldoSecundario() {
        return saldoSecundario;
    }

    public void setSaldoSecundario(double reserva) {
        if (reserva > 0)
            super.setSaldo(super.getSaldo()-reserva);
            this.saldoSecundario = reserva;
    }


    @Override
    public double retirarDinero(double platita) {
        try {
            if (platita > 0 && super.getSaldo() >= platita){
                super.setSaldo(super.getSaldo() - platita);
                return platita;
            }
            else throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");

        }catch (DineroNoDisponibleException dnd){
            System.err.println(dnd.getMessage());
            return 0.0;
        }

    }
    public void reintegro(){
        super.setSaldo(super.getSaldo()+getSaldoSecundario());
        setSaldoSecundario(0);
    }
}
