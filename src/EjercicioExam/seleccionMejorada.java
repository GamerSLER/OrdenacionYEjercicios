package EjercicioExam;

public class seleccionMejorada {
    public static void main(String[] args) {
        int[] tabla = {3, 5, 2, 1, 4, 7, 6, 9, 8};   // Array desordenado

        for (int P = 0; P < tabla.length - 1; P++) {
            int menor = tabla[P];
            int posicion = P;

            for (int J = P + 1; J < tabla.length; J++) {
                if (menor > tabla[J]) {
                    menor = tabla[J];
                    posicion = J;
                }
            }

            if (posicion != P) {
                // Intercambiar tabla[P] y tabla[posicion]
                int temp = tabla[P];
                tabla[P] = tabla[posicion];
                tabla[posicion] = temp;
            }
        }

        // Mostrar resultado
        System.out.println("Array ordenado:");
        for (int num : tabla) {
            System.out.print(num + " ");
        }
    }
}
