/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
c
 */
package ejer1;

import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer número");
        int num1 = input.nextInt();
        System.out.println("Ingrese el valor del segundo número");
        int num2 = input.nextInt();
        int opcion=0;
        do {
        System.out.println("Ingrese una opcion del 1 al 5");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3- MULTIPLICAR");
        System.out.println("4- DIVIDIR");
        System.out.println("5- SALIR");
       opcion = input.nextInt();
     
     
            switch (opcion) {
                case 1:
                    suma(num1, num2);
                    break;
                case 2:
                    resta(num1, num2);
                    break;
                case 3:
                    multi(num1, num2);
                    break;
                case 4:
                    dividir(num1, num2);
                    break;
                case 5:
                    System.out.println("Espero que te haya servido el programa");
                    break;
            }         
        

        } while (opcion != 5);
        
    }

    public static int suma(int num1, int num2){
    int sum4 = num1 + num2;

    System.out.println ("La suma de los números ingresados es: "+sum4);
    return sum4 ;
    }

    public static int resta(int num1, int num2){
        int rest4=num1-num2;
        System.out.println("La resta de el primer número menos el segundo es: "+rest4);        
        return rest4;
    }
    public static int multi(int num1, int num2){
        int multipli=num1*num2;
        System.out.println("El resultado de la multiplicación es :"+multipli);
        return multipli;
    }
    public static double dividir(int num1, int num2){
        double divi=0;
        if (num2>num1 || num2==0){
            System.out.println("ERROR el primer número no se puede dividir por el segundo, ya que es mayor al primero o igual a cero");
        }else {
            divi=num1/num2;
            System.out.println("El resultado de la división entre el primer número y el segundo es :"+divi);            
        }
        return divi;
}
}  

