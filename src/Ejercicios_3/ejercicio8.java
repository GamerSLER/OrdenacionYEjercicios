package Ejercicios_3;

import java.util.Random;

public class ejercicio8 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("10 números aleatorios entre 0 y 999:");

        for (int i = 0; i < 10; i++) {
            int numero = rand.nextInt(1000);
            System.out.println(numero);
        }
    }
}
