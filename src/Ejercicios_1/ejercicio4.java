package Ejercicios_1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 palabras: ");
        String palabra1 = sc.nextLine();
        String palabra2 = sc.nextLine();
        String palabra3 = sc.nextLine();

        String primera, segunda, tercera;

        if (palabra1.compareTo(palabra2) <= 0 && palabra1.compareTo(palabra3) <= 0){
            primera = palabra1;
            if (palabra2.compareTo(palabra3) <= 0){
                segunda = palabra2;
                tercera = palabra3;
            } else {
                segunda = palabra3;
                tercera = palabra2;
            }
        } else if (palabra2.compareTo(palabra1) <= 0 && palabra2.compareTo(palabra3) <= 0) {
            primera = palabra2;
            if (palabra1.compareTo(palabra3) <= 0) {
                segunda = palabra1;
                tercera = palabra3;
            } else {
                segunda = palabra3;
                tercera = palabra1;
            }
        } else {
            primera = palabra3;
            if (palabra1.compareTo(palabra2) <= 0){
                segunda = palabra1;
                tercera = palabra2;
            } else {
                segunda = palabra2;
                tercera = palabra1;
            }
        }
        System.out.println("------------------- PALABRAS ORDENADAS -------------------");
        System.out.println(primera);
        System.out.println(segunda);
        System.out.println(tercera);
    }
}
