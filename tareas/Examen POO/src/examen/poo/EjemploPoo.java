/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.poo;

/**
 *
 * @author Justin
 */
public class EjemploPoo {
    private String putoExamen;
    private String abrahamEstaAmorfo;
    private String boingsitoDeUva;

    // Constructor Por Defecto
    public EjemploPoo() {
    }
    
    // Constructor Sobrecargado 
    public EjemploPoo(String putoExamen, String abrahamEstaAmorfo, String boingsitoDeUva) {
        this.putoExamen = putoExamen;
        this.abrahamEstaAmorfo = abrahamEstaAmorfo;
        this.boingsitoDeUva = boingsitoDeUva;
    }

    // Getters and Setters
    public String getBoingsitoDeUva() {
        return boingsitoDeUva;
    }

    public void setBoingsitoDeUva(String boingsitoDeUva) {
        this.boingsitoDeUva = boingsitoDeUva;
    }

    public String getPutoExamen() {
        return putoExamen;
    }

    public void setPutoExamen(String putoExamen) {
        this.putoExamen = putoExamen;
    }

    public String getAbrahamEstaAmorfo() {
        return abrahamEstaAmorfo;
    }

    public void setAbrahamEstaAmorfo(String abrahamEstaAmorfo) {
        this.abrahamEstaAmorfo = abrahamEstaAmorfo;
    }

    // Método Especial toString
    @Override
    public String toString() {
        return "EjemploPoo{" + "putoExamen=" + putoExamen + ", abrahamEstaAmorfo=" + abrahamEstaAmorfo + ", boingsitoDeUva=" + boingsitoDeUva + '}';
    }
    
    
    
    
}
