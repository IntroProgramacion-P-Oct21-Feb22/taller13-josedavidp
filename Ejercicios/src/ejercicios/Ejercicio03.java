/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    public static void main(String[] args) {
try {
            Scanner entrada = new Scanner(System.in);
            double calificacion;
            String nombre;

            int i = 1;
            while (i <= 4) {
                System.out.println("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                if (calificacion > 10 || calificacion < 0) {
                    throw new Exception("El valor de la calificacion debe estar"
                            + " entre 0 y 10");
                }
                System.out.println("Ingrese nombre: ");
                entrada.nextLine();
                nombre = entrada.nextLine();
                if (nombre.equals("Mario") || nombre.equals("Pedro")
                        || nombre.equals("Ana") || nombre.equals("Luis")
                        || nombre.equals("Carolina")) {
                    throw new Exception("Los nombre no pueden ser "
                            + "Mario, Pedro, Ana, Luis o Carolina");
                }
                System.out.printf("Nombre: %s\n"
                        + "Calificación: %.1f\n",
                        nombre, calificacion);
                i = i + 1;
            }

        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }

        System.out.printf("%s\n", "Gracias por usar el sistema");
    }
}