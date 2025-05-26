package LogicaEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros.add(sc.nextInt());
        }

        int max = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > max) {
                max = numeros.get(i);
            }
        }

        int min = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(0) < min){
                min = numeros.get(i);
            }
        }

        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
    }
}
