package Ejercicios_3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumeros = 0;
        int negativosConvertidos = 0;
        int numero;

        System.out.println("Introduce números enteros (0 para terminar):");

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero != 0) {
                totalNumeros++;
                if (numero < 0) {
                    negativosConvertidos++;
                    numero = Math.abs(numero);
                }
            }
        } while (numero != 0);

        System.out.println("\nTotal de números introducidos: " + totalNumeros);
        System.out.println("Números negativos convertidos a positivos: " + negativosConvertidos);
    }
}
