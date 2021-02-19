import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Introduzca el primer número: ");
        int primerNumero = errores(0);

        System.out.print("Introduzca el segundo número: ");
        int segundoNumero = errores(0);

        int numeroMayor = mayorNumeros(primerNumero, segundoNumero);

        System.out.println("----------------------------------------");

        System.out.println(
                "Entre " + primerNumero + " y " + segundoNumero + ". El número mayor número es: " + numeroMayor);

        System.out.println("----------------------------------------");

        System.out.print("Introduzca el tercer número: ");
        int terceroNumero = errores(0);

        numeroMayor = mayorNumeros(primerNumero, segundoNumero, terceroNumero);

        System.out.println("Entre " + primerNumero + ", " + segundoNumero + " y " + terceroNumero
                + ". El número mayor número es: " + numeroMayor);
    }

    public static int mayorNumeros(int a, int b) {
        return Math.max(a, b);
    }

    public static int mayorNumeros(int a, int b, int c) {
        return Math.max(c, Math.max(a, b));
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

        return x;
    }
}