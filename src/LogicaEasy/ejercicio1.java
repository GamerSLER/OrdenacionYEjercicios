package LogicaEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros.add(sc.nextInt());
        }

        int pares = 0, impares = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Hay " + pares + " número pares y " + impares + " números impares.");
    }
}
