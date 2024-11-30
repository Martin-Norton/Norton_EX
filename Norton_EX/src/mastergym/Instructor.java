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
public class Instructor {
    private int idInstructor;
    private String nombre;
    private String especialidad;

    public Instructor(int idInstructor, String nombre, String especialidad) {
        this.idInstructor = idInstructor;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void registrarLlegada() {
        System.out.println("El instructor " + nombre + " ha llegado.");
    }

    public void registrarSalida() {
        System.out.println("El instructor " + nombre + " se ha ido.");
    }
    
}
