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
public class SumaNumeros {
      public static int ObtenerSumaNumeros(int n){
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
}
      public static int SumaRecursiva (int a){
          if (a <= 0) {
              return 0;
          }else{
              return a + SumaRecursiva(a - 1);
          }
      }
}

