package Ejercicios_3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        double resultado = Math.exp(numero);

        System.out.println("e elevado a " + numero + " es: " + resultado);
    }
}
