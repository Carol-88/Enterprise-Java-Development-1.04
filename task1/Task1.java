package org.example.task1;

public class Task1 {
    public static int calcularDiferencia(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }
}

    /*
    1. Generar los números
    2. Definir la función
        1. Recibir un array
        2. Select min-max
        3. Iterar sobre el array comprobando min-max
        4. Realizar la resta
        5. Devolver la resta
     3. Mostrar en pantalla el resultado.
     */


//La clave para encontrar el mínimo y el máximo es usar una estrategia sencilla:
//Empezar con una suposición.
//Antes de empezar a recorrer el array, puedes suponer que el primer elemento es,
//al mismo tiempo, el valor más pequeño y el más grande.
//Crea dos variables, por ejemplo minimo y maximo, y asígnales el valor del primer elemento
//del array (array[0]). Esto es seguro porque el problema dice que el array siempre tendrá
//al menos un elemento. Recorrer el array y comparar. Después de inicializar tus variables,
//usa un bucle (for) para recorrer el resto del array (desde el segundo elemento, array[1],
//hasta el final).
//En cada paso del bucle, haz estas dos preguntas: ¿Es el elemento actual más grande que maximo?
//Si es así, actualiza maximo con el valor de ese elemento. ¿Es el elemento actual más
//pequeño que minimo? Si es así, actualiza minimo con el valor de ese elemento.