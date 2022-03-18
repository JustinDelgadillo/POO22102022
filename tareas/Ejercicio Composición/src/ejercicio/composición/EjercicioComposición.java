/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.composición;

import ico.fes.componentes.Autor;
import ico.fes.componentes.Editorial;
import ico.fes.libros.Libro;

/**
 *
 * @author PC
 */
public class EjercicioComposición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro();
        lib.setTitulo("El Conde de Montecristo");
        lib.setEdicion( 2017 );
        lib.setCosto( 400 );
        Autor autor = new Autor();
        autor.setNombre("Alejandro Dumas");
        autor.setGentilicio("Francés");
        Editorial editorial = new Editorial();
        editorial.setNombre("Mirlo");
        editorial.setDirección("M. A. de Quevedo No. 209, Col. Romero de Terreros C.P. 04310");
        
        System.out.println( autor );
        System.out.println( lib );
        System.out.println( editorial );
        System.out.println( autor );
        autor.escribir();
        System.out.println( editorial );
        editorial.vender();
        
        
    }
    
}
