/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;


/**
 *
 * @author juanyanza11
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int suma = SumaNumeros.ObtenerSumaNumeros(5);
       int suma2 = SumaNumeros.SumaRecursiva(5);
        System.out.printf("Suma normal: %d\n",suma);
        System.out.printf("Suma Recursiva: %d\n",suma2);
    }
    
 
    }
    
    
