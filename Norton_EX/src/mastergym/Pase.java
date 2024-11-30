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
public class Pase {
    private int idPase;
    private String tipo;
    private double precio;
    private int clasesRestantes;
    private Date fechaVencimiento;

    public Pase(int idPase, String tipo, double precio, int clasesRestantes, Date fechaVencimiento) {
        this.idPase = idPase;
        this.tipo = tipo;
        this.precio = precio;
        this.clasesRestantes = clasesRestantes;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void registrarAsistencia() {
        if (clasesRestantes > 0) {
            clasesRestantes--;
        } else {
            System.out.println("No quedan clases disponibles.");
        }
    }

    public void renovar() {
        this.fechaVencimiento = new Date();
    }

    public int getClasesRestantes() {
        return clasesRestantes;
    }

    public void setClasesRestantes(int clasesRestantes) {
        this.clasesRestantes = clasesRestantes;
    }

}
