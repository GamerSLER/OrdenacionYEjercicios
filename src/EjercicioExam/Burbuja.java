package EjercicioExam;

public class Burbuja {
    public static void main(String[] args) {
        int[] numeros = {6, 2, 4, 7, 3, 1, 5};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        for (int num : numeros) {
            System.out.println(num + " ");
        }
    }
}
