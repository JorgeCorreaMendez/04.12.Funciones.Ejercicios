import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Introduzca el número: ");
        int primerNumero = errores(0);

        int[] arrayPrimos = primo(primerNumero);

        System.out.println("El número " + primerNumero + " tiene los siguiente divisores primos: ");

        for(int i = 1; i < arrayPrimos.length; i++){
            System.out.print(arrayPrimos[i]);
        }
    }

    public static int[] primo(int x) {
        boolean primo = true;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                primo = false;
            }
        }

        int numerosPrimos[] = new int[x];

        if(!primo){
            for(int i = 1; i < numerosPrimos.length; i++){
                if(x % i != 0){
                    numerosPrimos[i] = i;
                }
            }
        }
        return numerosPrimos;
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
