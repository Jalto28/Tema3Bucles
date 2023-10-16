import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la hora (formato 24 horas): ");
        int h = teclado.nextInt();
        
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Introduce los minutos: ");
        int m = teclado.nextInt();

        System.out.print("Introduce los segundos: ");
        int s = teclado.nextInt();

        boolean esHoraValida = esHoraValida(h, m, s);

        if (esHoraValida) {
            System.out.println("La hora ingresada es válida: " + h + ":" + m + ":" + s);
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }

    public static boolean esHoraValida(int hora, int minutos, int segundos) {
        return (hora >= 0 && hora < 24) &&
               (minutos >= 0 && minutos < 60) &&
               (segundos >= 0 && segundos < 60);
    }
    teclado.close();
}
