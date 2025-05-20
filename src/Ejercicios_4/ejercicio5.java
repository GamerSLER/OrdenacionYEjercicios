package Ejercicios_4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas = -1, minutos = -1;
        while (!esBuenaHora(horas, minutos)) {
            System.out.print("Introduce una hora (0-23) --> ");
            horas = sc.nextInt();

            System.out.print("Introduce los minutos (0-59) --> ");
            minutos = sc.nextInt();
        }
        int segundos = 0;
        int[] hora = {horas, minutos, segundos};

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
                avanzarLaHora(hora);
                imprimirHora(hora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void avanzarLaHora(int[] hora) {
        hora[2]++;
        if (hora[2] == 60) {
            hora[1]++;
            hora[2] = 0;
        }
        if (hora[1] == 60) {
            hora[0]++;
            hora[1] = 0;
        }
        if (hora[0] == 24){
            hora[0] = 0;
        }
    }

    public static void imprimirHora(int[] hora) {
        String horas = hora[0]+"";
        String minutos = hora[1]+"";
        String segundos = hora[2]+"";
        String[] horaString = {horas, minutos, segundos};
        for (int i = 0; i < horaString.length; i++) {
            if (horaString[i].length() == 1){
                horaString[i] = "0"+horaString[i];
            }
        }

        System.out.println(horaString[0]+":"+horaString[1]+":"+horaString[2]);
    }

    public static boolean esBuenaHora(int horas, int minutos) {
        if (minutos < 0 || minutos > 59 || horas < 0 || horas > 23) {
            return false;
        }
        return true;
    }
}
