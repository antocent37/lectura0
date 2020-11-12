package cuentas;

import java.lang.Exception;

public class DineroNoDisponibleException extends Exception {

        public DineroNoDisponibleException(String mensaje) {
            super(mensaje);

        }
}

