package Ejercicios_1;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String letras = "";
        for (int i = 0; i < frase.length(); i++) {
            letras += frase.charAt(i) + "-";
        }
        System.out.println(letras);
    }
}
