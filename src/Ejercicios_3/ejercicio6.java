package Ejercicios_3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        double numero = sc.nextDouble();

        System.out.print("Introduce el radical (índice de la raíz): ");
        double radical = sc.nextDouble();

        if (radical != 0) {
            double resultado = Math.pow(numero, 1.0 / radical);
            System.out.println("La raíz " + radical + " de " + numero + " es: " + resultado);
        } else {
            System.out.println("El radical no puede ser cero.");
        }
    }
}
