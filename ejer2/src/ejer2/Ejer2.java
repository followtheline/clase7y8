/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. Después 
de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando 
personas y frenar cuando el usuario ingrese la palabra “No”.
c
 */
package ejer2;

import java.util.Scanner;
public class Ejer2 {

   
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        String seguirMostrando = "Si";

        while (seguirMostrando.equalsIgnoreCase("Si")) {
            System.out.print("Ingrese el número de personas: ");
            int numPersonas = scanner.nextInt();
            scanner.nextLine(); // consumir el salto de línea después de leer un entero

            String[] nombres = leerNombres(numPersonas, scanner);
            int[] edades = leerEdades(numPersonas, nombres, scanner);
            mostrarDatos(nombres, edades);

            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            seguirMostrando = scanner.nextLine();
        }
    }

    public static String[] leerNombres(int numPersonas, Scanner scanner) {
        String[] nombres = new String[numPersonas];
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i+1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        return nombres;
    }

    public static int[] leerEdades(int numPersonas, String[] nombres, Scanner scanner) {
        int[] edades = new int[numPersonas];
        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Ingrese la edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); // consumir el salto de línea después de leer un entero
        }
        return edades;
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static void mostrarDatos(String[] nombres, int[] edades) {
        for (int i = 0; i < nombres.length; i++) {
            String mensaje = esMayorDeEdad(edades[i]) ? "mayor de edad" : "menor de edad";
            System.out.println(nombres[i] + " tiene " + edades[i] + " años y es " + mensaje);
        }
    }
}