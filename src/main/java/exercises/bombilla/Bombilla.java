package exercises.bombilla;

import java.util.Scanner;

public class Bombilla {
    private boolean estado = false;
    private int potencia;
    private String color;
    private float horas = 10.0f;

    private Scanner scanner = new Scanner(System.in);

    public Bombilla(int potencia, String color) {
        this.potencia = potencia;
        this.color = color;
    }

    public void encender() {
        if (horas <= 0) {
            System.out.println("❌ No se puede encender, no quedan horas disponibles.");
            return;
        }

        System.out.print("¿Cuántas horas desea mantener la bombilla encendida? ");
        float tiempo = scanner.nextFloat();

        if (tiempo > horas) {
            System.out.println("⚠️ No hay suficientes horas. Solo quedan: " + horas);
        } else {
            estado = true;
            horas -= tiempo;
            System.out.println("💡 Bombilla encendida por " + tiempo + " horas.");
        }
    }

    public void apagar() {
        if (!estado) {
            System.out.println("🔌 La bombilla ya está apagada.");
        } else {
            estado = false;
            System.out.println("🔌 Bombilla apagada.");
        }
    }

    public boolean ver_estado() {
        System.out.println("Estado actual: " + (estado ? "Encendida" : "Apagada"));
        return estado;
    }

    public void cambia_potencia(int nuevaPotencia) {
        potencia = nuevaPotencia;
        System.out.println("🔧 Potencia cambiada a: " + potencia + "W");
    }

    public int ver_potencia() {
        System.out.println("🔋 Potencia actual: " + potencia + "W");
        return potencia;
    }

    public void cambia_color(String nuevoColor) {
        if (estado) {
            apagar();
        }
        color = nuevoColor;
        System.out.println("🎨 Color cambiado a: " + color);
    }

    public void ver_color() {
        System.out.println("🎨 Color de la bombilla: " + color);
    }

    public void recargar() {
        System.out.print("¿Cuántas horas desea recargar? ");
        float extra = scanner.nextFloat();
        horas += extra;
        System.out.println("🔄 Se recargaron " + extra + " horas. Total ahora: " + horas);
    }
}
