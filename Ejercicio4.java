import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("Introduzca los grados Fahrenheit: ");
        double gFahrenheit = errores(0);
        double gCelsius = gCelsius(gFahrenheit);

        String dosDecimales = String.format("%.2f", gCelsius);
        System.out.println(gFahrenheit + "ºF son: " + dosDecimales + "Cº");
    }

    public static double gCelsius(double x) {
        return (x - 32) * 5 / 9;
    }

    public static double errores(double x) {
        Scanner leer = new Scanner(System.in);
        boolean error = true;

        do {
            try {
                x = leer.nextDouble();
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