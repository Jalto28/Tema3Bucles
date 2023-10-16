import java.util.Scanner;

public class Ej11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int cantidadNumeros = 0;
        int numero;

        System.out.println("Introduce números para calcular la media (Introduce un número negativo para terminar):");

        do {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            if (numero >= 0) {
                suma += numero;
                cantidadNumeros++;
            }
        } while (numero >= 0);

        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números para calcular la media.");
        }
        teclado.close();
    }
}
