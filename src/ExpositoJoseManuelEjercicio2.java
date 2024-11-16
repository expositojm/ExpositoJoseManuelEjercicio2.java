import java.util.Scanner;
public class ExpositoJoseManuelEjercicio2 {
    public static void main(String[] args) {
        int size;        // tamaño elegido por el usuario
        String pattern; //caracter elegido por usuario es string para controlar que solo introduzca 1


        Scanner scanner = new Scanner(System.in);
        //pedir el caracter (solo 1 caracter)
        do {
            System.out.println("TABLERO PERSONALIZADO");
            System.out.println();
            System.out.print("Introduce el caracter que quieres para tu tablero: ");
            pattern = scanner.nextLine();

            if (pattern.length() != 1) {
                System.out.println("Solo uno caracter por favor");
            }
        } while (pattern.length() != 1);

        // Solicitar el tamaño

        do {
            System.out.print("Introduce el tamaño de la cuadricula (1-15): ");
            size = scanner.nextInt();
        } while (size < 1 || size > 15);

        //imprimir barra separadora horizonal
        System.out.println("Aqui tienes tu tablero personalizado:");
        for (int i = 0; i < 8 * (size + 1) + 1; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int row = 0; row < 8; row++) {
            for (int height = 0; height < size; height++) {
                for (int column = 0; column < 8; column++) {
                    System.out.print("|");
                    for (int width = 0; width < size; width++) {
                        if ((row + column) % 2 == 1) {                     //si es par imprime pattern
                            System.out.print(pattern);
                        } else {
                            System.out.print(" ");                         //si no imprime en blanco
                        }
                    }
                }
                System.out.println("|");
            }
            //imprimir barra separadora horizonal
            for (int i = 0; i < 8 * (size + 1) + 1; i++) {
                System.out.print("-");
            }
            System.out.println();
        }

        

    }
}