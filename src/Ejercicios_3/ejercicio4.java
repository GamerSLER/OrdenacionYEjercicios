package Ejercicios_3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número real: ");
        double numero = sc.nextDouble();

        int truncado = (int) Math.floor(numero);

        System.out.println("Número truncado: " + truncado);
    }
}

