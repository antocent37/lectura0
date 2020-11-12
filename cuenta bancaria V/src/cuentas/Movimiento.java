package cuentas;

import java.util.Date;

public class Movimiento {
    double monto;
    String motivo;
    String fecha;

    public Movimiento(double monto, String motivo) {
        this.monto = monto;
        this.motivo = motivo;
        this.fecha = new Date().toString();
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String toString(){
        return "Operacion: " + this.motivo + " de $ "+ getMonto() +  " Fecha: " + this.fecha;
    }
}
