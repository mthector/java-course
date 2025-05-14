package exercises;

import java.util.Scanner;

public class SistemaDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double monto = scanner.nextDouble();

        // Solicitar si es miembro de la tienda
        System.out.print("¿Es miembro de la tienda? (true/false): ");
        boolean esMiembro = scanner.nextBoolean();

        double descuento;

        // Evaluar condiciones
        if (monto > 1000 && esMiembro) {
            descuento = 0.10;
        } else if (esMiembro) {
            descuento = 0.05;
        } else {
            descuento = 0.0;
        }

        // Calcular y mostrar el descuento
        double montoDescuento = monto * descuento;
        double total = monto - montoDescuento;

        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Total a pagar: $" + total);
    }
}
