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
public class Clase {
    private int idClase;
    private String nombre;
    private String tipo;
    private int maxParticipantes;
    private List<Socio> sociosInscritos;
    private List<Horario> horarios; 
    private List<Instructor> instructores;

    public Clase(int idClase, String nombre, String tipo, int maxParticipantes) {
        this.idClase = idClase;
        this.nombre = nombre;
        this.tipo = tipo;
        this.maxParticipantes = maxParticipantes;
        this.sociosInscritos = new ArrayList<>();
        this.horarios = new ArrayList<>();
        this.instructores = new ArrayList<>();
    }

    public void inscribirSocio(Socio socio) {
        if (sociosInscritos.size() < maxParticipantes) {
            sociosInscritos.add(socio);
        } else {
            System.out.println("La clase está llena.");
        }
    }

    public void cancelarClase() {
        sociosInscritos.clear();
        System.out.println("Clase cancelada.");
    }

}
