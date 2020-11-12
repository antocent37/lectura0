public class Cuenta {
    double saldo;

    //consulta de saldo por pantalla
    public void consultaDinero(){
        System.out.println(this.getSaldo());
    }
    // agregar saldo a la cuenta, siempre recibe saldo positivo
    public void ponerDinero(double platita){
        if (platita > 0)
            setSaldo(getSaldo() + platita);
    }
    // controla no sacar mas del saldo, ni que la extraccion solicitada sea negativa
    public double sacarDinero(double platita){
        if (platita > 0 && getSaldo() >= platita){
            setSaldo(getSaldo() - platita);
               return platita;
            }
        return 0;
    }
    // setter monto
    public void setSaldo(double platita){
        if (platita > 0)
           this.saldo = platita;
    }
    // getter monto
    public double getSaldo(){
        return this.saldo;
    }
    //tranferencias
    public void transferir(double montoTransfer, Cuenta cajaDestino){
        if (montoTransfer > 0 && this.getSaldo() >= montoTransfer) {
            System.out.println("Transfiriendo.....");
            cajaDestino.ponerDinero(this.sacarDinero(montoTransfer));
        }
    }

}
