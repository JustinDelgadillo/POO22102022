/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Autor {
    private String nombre;
    private String gentilicio;
    private int edad; 

    public Autor() {
    }

    public Autor(String nombre, String gentilicio, int edad) {
        this.nombre = nombre;
        this.gentilicio = gentilicio;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", gentilicio=" + gentilicio + ", edad=" + edad + '}';
    }
    
    
    
}
