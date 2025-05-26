package Practicas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<Character> consonantes = new ArrayList<>(
                Arrays.asList('b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z')
        );
        ArrayList<Character> vocales = new ArrayList<>(
                Arrays.asList('a','e','i','o','u')
        );

        ArrayList<Character> secuencia = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                secuencia.add(consonantes.get(random.nextInt(consonantes.size())));
            } else {
                secuencia.add(vocales.get(random.nextInt(vocales.size())));
            }
        }

        System.out.print("Cadena generada: ");
        for (char c : secuencia) System.out.print(c);
        System.out.println();

        System.out.print("Introduce una vocal (a, e, i, o, u): ");
        char nuevaVocal = sc.nextLine().toLowerCase().charAt(0);

        if (!vocales.contains(nuevaVocal)) {
            System.out.println("Vocal no válida.");
            return;
        }

        for (int i = 1; i < secuencia.size(); i += 2) {
            secuencia.set(i, nuevaVocal);
        }

        System.out.print("Cadena modificada: ");
        for (char c : secuencia) System.out.print(c);
        System.out.println();
    }
}
