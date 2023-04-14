/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida 
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
c
 */
package ejer3;

import java.util.Scanner;
public class Ejer3 {

   
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros que desea convertir: ");
        int num=input.nextInt();
        conversion(num);
    }
    public static void conversion(int num){
        double libras=num*0.86;
        double dolares=num*1.28611;
        double yenes=num*129.852;
        System.out.println("La cantidad de "+num+" euros ingresadas, equivale a: "+libras+ " libras");
        System.out.println("La cantidad de "+num+" euros ingresadas, equivale a: "+dolares+" dolares");
       System.out.println("La cantidad de "+num+" euros ingresadas, equivale a: "+yenes+" yenes");
    }
}
