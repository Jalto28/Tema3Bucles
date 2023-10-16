import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int suma = 0;
        int numero;

        System.out.println("Introduce números para sumar (introduce 0 para terminar):");

        do {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma de los números introducidos es: " + suma);
		
	teclado.close();
    }
}
