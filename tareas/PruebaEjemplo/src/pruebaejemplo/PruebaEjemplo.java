/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Justin
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Banco");
       
       System.out.println("---------------------");
       System.out.println("Datos de los Clientes: "); 
       
       String [] nombres = new String [5]; 
        
        nombres[0] = "SANTIAGO";
        nombres[1] = "DIEGO";
        nombres[2] = "JAVIER";
        nombres[3] = "AGUSTIN";   
        nombres[4] = "IGNACIO";   

        for(String nombre : nombres)
        {

    }
        int [] idCliente = {45963,35421,58125,96475,77503};
        int [] balance = {15000,37500,9000000,22000,1000000};

  
        
            
            
        
       String SANTIAGO     =  ("Nombre: " + nombres [0] + " ID: " + idCliente [0]+ " Tu balance es de: " + balance [0] );
       String DIEGO     =  ("Nombre: " + nombres [1] + " ID: "+ idCliente [1] + " Tu balance es de: " + balance [1] );
       String JAVIER     =  ("Nombre: " + nombres [2] + " ID: " + idCliente [2] + " Tu balance es de: " + balance [2] );
       String AGUSTIN     =  ("Nombre: " + nombres [3] + " ID: " + idCliente [3] + " Tu balance es de: " + balance [3] );
       String IGNACIO     =  ("Nombre: " + nombres [4] + " ID: " + idCliente [4] + " Tu balance es de: " + balance [4] );
       
               
        System.out.println( SANTIAGO );
        System.out.println("-------------------------------------------------------");
        System.out.println( DIEGO );
        System.out.println("-------------------------------------------------------");
        System.out.println( JAVIER );
        System.out.println("-------------------------------------------------------");
        System.out.println( AGUSTIN );
        System.out.println("-------------------------------------------------------");
        System.out.println( IGNACIO );
        String res = "";
        for (int i:balance){
            if( i < 50000){
                res = "Cliente Regular";
            }else{
                res = "Cliente Premium";
            }
        
            System.out.println("-------------------------------------------------------");
            System.out.println( "Tipo de Cliente (respectivamente): "  + res );
            
        }
            System.out.println("-------------------------------------------------------");
            System.out.println("Transacciones");
            System.out.println("-------------------------------------------------------");
            System.out.println("Datos del cliente: ");
            System.out.println( JAVIER );
            System.out.println("Realiza un retiro de: 1000000");
            System.out.println("Procesando...");
            System.out.println("Procesando...");
            System.out.println("Procesando...");
            System.out.print("Su nuevo saldo es de: ");
            System.out.println( balance [2] - 1000000);
        
       }     


         
    }
