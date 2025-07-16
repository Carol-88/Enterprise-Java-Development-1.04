package org.example.task3;

public class Task3 {
    public static double calculateExpression(double x, double y) {
        // Paso 1: Calcular (4 * y) / 5
        // Usamos 4.0 y 5.0 para asegurar que la división sea de punto flotante
        // y no una división entera que truncaría el resultado. Se utiliza double porque es
        // más óptimo en operaciones con potencias y raíces cuadradas.
        double term1 = (4.0 * y) / 5.0;

        // Paso 2: Calcular (4*y)/5 - x
        double term2 = term1 - x;

        // Paso 3: Elevar el resultado del Paso 2 al cuadrado
        // Math.pow(base, exponente) eleva la 'base' a la potencia del 'exponente'.
        double squaredTerm2 = Math.pow(term2, 2); // Esto es ((4*y)/5 - x)^2

        // Paso 4: Elevar x al cuadrado
        double squaredX = Math.pow(x, 2); // Esto es x^2

        // Paso 5: Sumar los resultados del Paso 3 y Paso 4
        double finalResult = squaredX + squaredTerm2;

        return finalResult;
    }
}
