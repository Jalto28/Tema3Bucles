import java.util.Random;
import java.util.Scanner;

public class Ej12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Introduce el número máximo de intentos: ");
        int intentosMaximos = teclado.nextInt();
        int numeroAdivinar = aleatorio.nextInt(100) + 1;
        int intentosRealizados = 0;

        System.out.println("Empieza el juego de adivinar el número entre 1 y 100.");

        while (intentosRealizados < intentosMaximos) {
            intentosRealizados++;

            System.out.print("Intento " + intentosRealizados + "/" + intentosMaximos + ". Introduce un número: ");
            int numeroUsuario = teclado.nextInt();

            if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else if (numeroUsuario > numeroAdivinar) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("¡Has adivinado el número! ¡Ganaste!");
                return;
            }
        }

        System.out.println("No has adivinado el número. Has agotado tus intentos. El número era: " + numeroAdivinar);
        teclado.close();
    }
}
