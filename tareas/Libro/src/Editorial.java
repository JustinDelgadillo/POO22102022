/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Editorial {
    private String nombre;
    private int añoFundacion; 
    private String direccion; 

    public Editorial() {
    }

    public Editorial(String nombre, int añoFundacion, String direccion) {
        this.nombre = nombre;
        this.añoFundacion = añoFundacion;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", a\u00f1oFundacion=" + añoFundacion + ", direccion=" + direccion + '}';
    }
    
    
    
}
