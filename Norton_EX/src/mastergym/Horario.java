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
public class Horario {
    private int idHorario;
    private String dia;
    private Date horaInicio;
    private Date horaFin;
    private Clase clase;

    public Horario(int idHorario, String dia, Date horaInicio, Date horaFin) {
        this.idHorario = idHorario;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void asignarClase(Clase clase) {
        this.clase = clase;
    }
    
}
