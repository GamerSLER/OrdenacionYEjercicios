package Ejercicio;
/*Programar en java
Clase automóvil
- String marca
- String modelo
- int numeroPasajeros -> inicializado en 5 a priori
- int capacidad -> litros de gasolina
- consumo -> decimal de cuanto consume a los 100k

programa que, introduciendo un coche con estas características, calcule la autonomía de un vehículo con el depósito lleno.

-------------------------------------

preguntar por la velocidad y te da la autonomía.
Por cada km por hora que supere los 130km/h, el gasto se incrementa en 3 litros a los 100.
*/

import java.util.Scanner;

public class Automovil {
    public void setMarca(String marca) {
        this.marca = marca;
    }

    protected String marca;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected String modelo;

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    protected int numPasajeros = 5; //Inicialice en 5

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    protected int capacidad;

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    protected double consumo;

    void autonomía(int velocidad) {
        if (velocidad > 130) {

        } else {

        }
    }
}