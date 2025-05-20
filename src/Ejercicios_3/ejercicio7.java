package Ejercicios_3;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        long redondeado = Math.round(numero);

        System.out.println("Número redondeado: " + redondeado);
    }
}
