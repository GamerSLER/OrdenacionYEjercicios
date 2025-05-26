package Practicas;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce números: ");
        int numero = sc.nextInt();

        String StrNum = String.valueOf(numero);
        String invertido = "";

        for (int i = StrNum.length()-1; i >= 0; i--) {
            invertido += StrNum.charAt(i);
        }

        if (StrNum.equals(invertido)){
            System.out.println("Es capicúa.");
        } else {
            System.out.println("No es capicúa.");
        }
    }
}
