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
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private String tipo;

    public Producto(int idProducto, String nombre, double precio, String tipo) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public void alquilar() {
        System.out.println("Producto alquilado: " + nombre);
    }

    public void vender() {
        System.out.println("Producto vendido: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

