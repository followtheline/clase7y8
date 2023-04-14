/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. Después 
de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando 
personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package ejer2;

import java.util.Scanner;
public class Ejer2 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int n=input.nextInt();
    }
    public static String personas(int n){
        String nombre=" ";
        for (int i = 0; i<n-1;i++){
            System.out.println("Ingrese el nombre de la persona "+i);
                    Scanner input2= new Scanner(System.in);
                    nombre=input2.nextLine();
        }
                    return nombre;
        }
    public static int edad(int n, )
    }

