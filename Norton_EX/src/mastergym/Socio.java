/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastergym;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin Norton
 */
public class Socio {
    private int idSocio;
    private String nombre;
    private String dni;
    private String direccion;
    private String condicionMedica;
    private List<Pase> pases;
    public Socio(int idSocio, String nombre, String dni, String direccion, String condicionMedica) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.condicionMedica = condicionMedica;
        this.pases = new ArrayList<>();
    }

    public void contratarPase(Pase pase) {
        pases.add(pase);
    }

    public void renovarPase(Pase pase) {
        if (pases.contains(pase)) {
            pase.renovar();
        } else {
            System.out.println("El socio no tiene este pase.");
        }
    }
}