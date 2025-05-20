package Ejercicios_3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        } else {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        }
    }
}
