package Practicas;

import java.util.Scanner;

public class ejercicio10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if (original == invertido) {
            System.out.println("Es capicúa.");
        } else {
            System.out.println("No es capicúa.");
        }
    }
}
