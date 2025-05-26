package Practicas;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce palabra: ");
        String palabra = sc.next();

        String invertida = "";

        for (int i = palabra.length()-1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }
        System.out.println("Palabra espejo: " + palabra + invertida);
    }
}
