package Ejercicios_2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase;
        String posicion;

        do {
            System.out.print("Introduce una frase (n para terminar) --> ");
            frase = sc.nextLine();

            if (frase.equals("n")) {

            } else {
                System.out.print("Introduce letra --> ");
                posicion = sc.next();
                sc.nextLine();

                int pos = frase.lastIndexOf(posicion);

                System.out.println("La primera " + posicion + " se encuentra en la posición " + pos);
            }
        } while(!frase.equals("n"));
    }
}
