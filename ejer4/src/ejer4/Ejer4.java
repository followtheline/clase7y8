/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos 
indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es 
divisible entre 5, sin embargo, 17 si es primo.
c
 */
package ejer4;

import java.util.Scanner;
public class Ejer4 {

  
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Ingrese un número entero para que el programa le diga si es primo o no");
        int num=input.nextInt();
        System.out.print(primoOno(num));
    }
    public static boolean primoOno(int num){
        
       if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
        
    }

