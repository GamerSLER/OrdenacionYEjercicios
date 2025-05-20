package EjercicioExam;

public class Seleccion {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 2, 1, 4, 7, 6, 9, 8};   // Array a ordenar

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]){
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        // Mostrar resultado
        System.out.println("Array ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
