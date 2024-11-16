import java.util.Scanner;
public class ExpositoJoseManuelEjercicio2 {
    public static void main(String[] args) {
        char pattern;
        int size;
        String input;


        Scanner scanner = new Scanner(System.in);
        //pedir el caracter (solo 1 caracter)
        do {
            System.out.println("TABLERO PERSONALIZADO");
            System.out.print("Introduce el caracter que quieres para tu tablero: ");
            input = scanner.nextLine();

            if (input.length() != 1) {
                System.out.println("Solo uno caracter por favor");
            }
        } while (input.length() != 1);

        // Solicitar el tamaño

        do {
            System.out.print("Introduce el tamaño de la cuadricula (1-15): ");
            size = scanner.nextInt();
        } while (size < 1 || size > 15);


    }
}