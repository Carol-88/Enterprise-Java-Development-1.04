package org.example.task2;

import java.util.Arrays;

public class Task2 {
    public static void findSmallestAndSecondSmallest(int[] array) {
        if (array == null || array.length < 2) {
            System.out.println("Error: El array debe contener al menos dos elementos.");
        }

        Arrays.sort(array);

        int smallest = array[0];
        int secondSmallest = array[1];

        System.out.println("El elemento más pequeño es: " + smallest);
        System.out.println("El segundo elemento más pequeño es: " + secondSmallest);

       /*
       - Ordenar el array de menor a mayor
       - Devolver la posicion 0 y 1
        */
    }
}
