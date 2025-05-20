//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro Ají = new Perro();
        Ají.nombre = "Ají";
        Ají.ladrar();
        Perro picante = Ají;
        picante.nombre = "Pepe";
        Ají.ladrar();
    }
}