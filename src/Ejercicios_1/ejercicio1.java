package Ejercicios_1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre 1 --> ");
        String nombre1 = sc.next();
        System.out.print("Introduce nombre 2 --> ");
        String nombre2 = sc.next();
        System.out.print("Introduce nombre 3 --> ");
        String nombre3 = sc.next();

        if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) {
            System.out.println("El nombre más largo es " + nombre1 + ", tiene " + nombre1.length() + " carácteres.");
        } else if (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()) {
            System.out.println("El nombre más largo es " + nombre2 + ", tiene " + nombre2.length() + " carácteres.");
        } else if (nombre3.length() > nombre2.length() && nombre3.length() > nombre1.length()) {
            System.out.println("El nombre más largo es " + nombre3 + ", tiene " + nombre3.length() + " carácteres.");
        } else {
            System.out.println("Ha ocurrido un error.");
        }

        if (nombre1.length() < nombre2.length() && nombre1.length() < nombre3.length()) {
            System.out.println("El nombre más corto es " + nombre1 + ", tiene " + nombre1.length() + " carácteres.");
        } else if (nombre2.length() < nombre1.length() && nombre2.length() < nombre3.length()) {
            System.out.println("El nombre más corto es " + nombre2 + ", tiene " + nombre2.length() + " carácteres.");
        } else if (nombre3.length() < nombre2.length() && nombre3.length() < nombre1.length()) {
            System.out.println("El nombre más corto es " + nombre3 + ", tiene " + nombre3.length() + " carácteres.");
        } else {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
