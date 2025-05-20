package Ejercicios_2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String palabra;
        do {
            System.out.print("Introduce una palabra (n para terminar)--> ");
            palabra = sc.nextLine();

            if (palabra.endsWith("ar") || palabra.endsWith("er") || palabra.endsWith("ir")){
                System.out.println("La palabra es infinitiva");
            } else if (palabra.equals("n")){

            } else {
                System.out.println("La palabra no es infinitiva.");
            }
        } while(!palabra.equals("n"));
    }
}
