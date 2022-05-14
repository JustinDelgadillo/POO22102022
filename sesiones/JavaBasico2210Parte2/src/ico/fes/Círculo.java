/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Justin
 */
public class Círculo implements Figura {
    public static final float pi=3.1416f; //Constante
    private float radio;

    public Círculo() {
    }

    public Círculo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "C\u00edrculo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return pi * (this.radio * this.radio);
    }

    @Override
    public String saludar() {
        System.out.println("Hola desde el Círculo");
        return "Hola C";
    }
    
    
}
