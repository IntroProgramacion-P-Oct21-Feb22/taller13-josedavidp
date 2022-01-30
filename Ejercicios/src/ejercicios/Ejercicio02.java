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
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        double promedio;
        double suma = 0;
        int numeroCalificaciones = 4;
        int i = 1;
        while (i <= 4) {
            try {
                System.out.println("Ingrese calificación: \n");
                calificacion = entrada.nextDouble();
                if (calificacion < 0 || calificacion > 10) {
                    throw new Exception("Dato fuera del rango");
                }
                suma = suma + calificacion;
                i = i + 1;

            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }

        promedio = suma / numeroCalificaciones;

        System.out.printf("%.2f\n", promedio);
    }
}
