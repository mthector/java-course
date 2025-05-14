package exercises;

public class MatrizDiagonal {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int valor = 100;
        int sumaDiagonal = 0;

        // Llenar la matriz con valores en centenas
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                matriz[fila][col] = valor;
                valor += 100;
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz 3x3:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println();
        }

        // Calcular la suma de la diagonal principal
        for (int i = 0; i < 3; i++) {
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}
