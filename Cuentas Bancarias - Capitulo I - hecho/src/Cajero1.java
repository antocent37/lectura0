/** Cambiar el nombre de la clase por el Cuenta*/
public class Cajero1 {
    double monto;

    //consulta de saldo por pantalla
    public void consultaDinero(){
        System.out.println(this.getMonto());
    }
    // agregar saldo a la cuenta
    public void ponerDinero(double platita){
        if (platita > 0)
            setMonto(getMonto() + platita);
    }
    // sacar plata de la cuenta
    public double sacarDinero(double platita){
        if (getMonto() >= platita){
            setMonto(getMonto() - platita);
            return platita;
        }
        return 0;
    }
    // setter monto
    public void setMonto(double platita){
        if (platita > 0)
            this.monto = platita;
    }
    // getter monot
    public double getMonto(){
        return this.monto;
    }
    public void transferir(double montoTransfer, Cajero1 cajaDestino){
       if (montoTransfer > 0 && this.getMonto() >= montoTransfer) {
           System.out.println("Transfiriendo.....");
           cajaDestino.ponerDinero(this.sacarDinero(montoTransfer));
       }
    }
}

