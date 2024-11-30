/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastergym;

/**
 *
 * @author Martin Norton
 */

public class PaseVencidoException extends Exception {

    public PaseVencidoException() {
        super();
    }

    public PaseVencidoException(String mensaje) {
        super(mensaje);
    }
    
    public PaseVencidoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public PaseVencidoException(Throwable causa) {
        super(causa);
    }
}

