import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        int primerNumero = errores(0);

        System.out.println("El número " + primerNumero + primo(primerNumero));
    }

    public static String primo(int x) {
        boolean primo = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            return " es primo";
        } else {
            return " no es primo";
        }
    }

    public static int errores(int x) {
        Scanner leer = new Scanner(System.in);
        boolean error = true;

        do {
            try {
                x = leer.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Error, no has introducido un número entero " + e);
                System.out.println("Vuelva a intentarlo: ");
                leer.nextLine();
            }
        } while (error);
        leer.close();

        return x;
    }
}
