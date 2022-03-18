/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author PC
 */
public class Editorial {
    private String nombre;
    private String dirección; 

    public Editorial() {
    }

    public Editorial(String nombre, int añoFundacion, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", direcci\u00f3n=" + dirección + '}';
    }
    public void vender (){
        System.out.println(this.nombre + " se encarga de vender libros" );
    
}
    
}