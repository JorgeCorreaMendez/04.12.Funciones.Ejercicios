import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número: ");
        int primerNumero = errores(0);

        String[] arrayPrimos = divisoresPrimo(primerNumero);

        System.out.println("El número " + primerNumero + " tiene los siguiente divisores primos: ");

        for (int i = 1; i < arrayPrimos.length; i++) {
            System.out.print(arrayPrimos[i]);
        }
    }

    public static String[] divisoresPrimo(int x) {
        String numerosPrimos[] = new String[x];

        for (int i = 1; i < numerosPrimos.length; i++) {
            if (primo(i)) {
                numerosPrimos[i] = i + " ";
            } else {
                numerosPrimos[i] = "";
            }
        }

        return numerosPrimos;
    }

    public static boolean primo(int x) {
        boolean primo = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            return true;
        } else {
            return false;
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
