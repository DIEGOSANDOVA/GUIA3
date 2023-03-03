/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class numerosEnteros {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numerosNegativos = 0;
        int numerosPositivos = 0;
        int cantidadMultiplos15 = 0;
        int acumuladoPares = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = teclado.nextInt();
            
            if (numero < 0) {
                numerosNegativos++;
            } else if (numero > 0) {
                numerosPositivos++;
            }
            
            if (numero % 15 == 0) {
                cantidadMultiplos15++;
            }
            
            if (numero % 2 == 0) {
                acumuladoPares += numero;
            }
        }
        
        System.out.println("La cantidad de números negativos es: " + numerosNegativos);
        System.out.println("La cantidad de números positivos es: " + numerosPositivos);
        System.out.println("La cantidad de múltiplos de 15 es: " + cantidadMultiplos15);
        System.out.println("El valor acumulado de los números ingresados que son pares es: " + acumuladoPares);
    }

}

