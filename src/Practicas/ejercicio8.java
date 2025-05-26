package Practicas;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce palabra 1: ");
        String palabra1 = sc.nextLine().toLowerCase();

        System.out.print("Introduce palabra 2: ");
        String palabra2 = sc.nextLine().toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son anagramas (diferente longitud).");
            return;
        }

        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        String ordenada1 = new String(letras1);
        String ordenada2 = new String(letras2);

        if (ordenada1.equals(ordenada2)) {
            System.out.println("Son anagramas.");
        } else {
            System.out.println("No son anagramas.");
        }
    }
}
