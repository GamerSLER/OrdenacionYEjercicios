package Ejercicios_2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        frase = frase.replace('a', 'A');
        frase = frase.replace('e', 'E');
        frase = frase.replace('i', 'I');
        frase = frase.replace('o', 'O');
        frase = frase.replace('u', 'U');

        System.out.println(frase);
    }
}
