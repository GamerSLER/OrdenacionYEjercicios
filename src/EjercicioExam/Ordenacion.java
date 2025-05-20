package EjercicioExam;

import java.util.Arrays;

public class Ordenacion {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 1, 4, 7, 6, 9, 8};
        System.out.println(Arrays.toString(numeros));
        numeros = burbujaMejorada(numeros);
        System.out.println(Arrays.toString(numeros));
    }

    public static int[] burbujaMejorada(int[] lista) {
        boolean ordenado = false;
        int aux = 0;
        int i = 0;
        while (!ordenado) {
            ordenado = false;
            for (int j = 0; j < lista.length - i; j++) {
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                    ordenado = false;
                }
            }
        }
        return lista;
    }

    public static int[] seleccionMejorada(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lista[j] < lista[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int aux = lista[i];
                lista[i] = lista[minIndex];
                lista[minIndex] = aux;
            }
        }
        return lista;
    }

    public static int[] inserccion(int[] lista){
        for (int i = 0; i < lista.length; i++) {
            int key = lista[i];
            int j = i - 1;

            while (j>=0 && lista[j] > key) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j+1] = key;
        }
        return lista;
    }
}