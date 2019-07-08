/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioArreglos;






/**
 *
 * @author juanyanza11
 */
public class TamanioArreglo {
      public static int sumaElementosArray(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + sumaElementosArray(arreglo2, tamanio - 1 ); 
        }
         
    }


}

