/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioArreglos;

import potencia.*;




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
        int valores[] = {10, 20, 30, 1, 2, 3, 40, 4};
        int tamanio = valores.length; // Obtener el tamaño del array
        int suma = 0; // Acumulador para el ciclo for
        
        for (int i = 0; i < valores.length; i++) { // Suma de los elementos del arreglo
            suma += valores[i];
            
        }
        int tamaniodata= TamanioArreglo.sumaElementosArray(valores, tamanio); // envio de parámetros al método recursivo
        System.out.printf("La suma de los elementos usando recursividad es: %d\n",tamaniodata);
        System.out.printf("La suma de los elementos usando un ciclo es: %d\n",suma);
      
    }
    
 
    }
    
    
