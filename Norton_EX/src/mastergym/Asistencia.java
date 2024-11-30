/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastergym;

import java.util.Date;

/**
 *
 * @author Martin Norton
 */
public class Asistencia {
    private int idAsistencia;
    private Date fecha;
    private Socio socio;
    private Clase clase;

    public Asistencia(int idAsistencia, Socio socio, Clase clase) {
        this.idAsistencia = idAsistencia;
        this.fecha = new Date();
        this.socio = socio;
        this.clase = clase;
    }
}
