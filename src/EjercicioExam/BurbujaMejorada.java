package EjercicioExam;

public class BurbujaMejorada {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 1, 4, 7, 6, 9, 8};  // Array desordenado
        boolean isOrdenado = false;

        while (!isOrdenado){
            isOrdenado = true;
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                    isOrdenado = false;
                }
            }
        }

        // Mostrar array ordenado
        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
