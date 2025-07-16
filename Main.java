package org.example;

import org.example.task1.Task1;
import org.example.task2.Task2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TASK 1
        int[] miArray = {1, 5, 3, 11, 15, 100, 34};
        int resultado = Task1.calcularDiferencia(miArray);

        System.out.println("La diferencia es: " + resultado);

        // TASK 2
        Task2.findSmallestAndSecondSmallest(miArray);

        // TASK 3


    }
}
