package LogicaEasy;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}
