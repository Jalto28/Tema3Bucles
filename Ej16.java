import java.util.Random;
import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int jugadorPorras = 0;
        int ordenadorPorras = 0;

        while (jugadorPorras < 5 && ordenadorPorras < 5) {
        	System.out.println("STATS JUEGO");
        	System.out.println("Jugador: " + jugadorPorras + " porras");
            System.out.println("Ordenador: " + ordenadorPorras + " porras");
            System.out.println("TURNO JUGADOR");

            int jugadorPuntos = 0;
            boolean jugadorTurno = true;

            while (jugadorPuntos < 11) {
                int dado = aleatorio.nextInt(6) + 1;
                System.out.println("Has lanzado un dado y obtuviste un " + dado);

                if (jugadorPuntos + dado > 11) {
                    System.out.println("Te has pasado de 11 puntos. ¡El ordenador gana!");
                    ordenadorPorras++;
                    jugadorTurno = false;
                    break;
                }

                jugadorPuntos += dado;
                System.out.println("Tienes " + jugadorPuntos + " puntos.");

                System.out.print("¿Quieres lanzar de nuevo (s/n)? ");
                char decision = teclado.next().charAt(0);

                if (decision == 'n') {
                    break;
                }
            }

            if (jugadorPuntos == 11) {
                System.out.println("¡Has alcanzado exactamente 11 puntos! Ganaste 2 porras.");
                jugadorPorras += 2;
                jugadorTurno = false;
            }

            if (jugadorTurno) {
                System.out.println("TURNO DEL ORDENADOR");
                int ordenadorPuntos = 0;

                while (ordenadorPuntos < 11 && ordenadorPuntos < jugadorPuntos) {
                    int dado = aleatorio.nextInt(6) + 1;
                    System.out.println("El ordenador lanzó un dado y obtuvo un " + dado);

                    if (ordenadorPuntos + dado > 11) {
                        System.out.println("El ordenador se ha pasado de 11 puntos. ¡Has ganado!");
                        jugadorPorras++;
                        break;
                    }

                    ordenadorPuntos += dado;
                    System.out.println("El ordenador tiene " + ordenadorPuntos + " puntos.");
                }

                if (ordenadorPuntos == 11) {
                    System.out.println("El ordenador ha alcanzado exactamente 11 puntos. Suma 1 porra.");
                    ordenadorPorras++;
                } else if (ordenadorPuntos >= jugadorPuntos && ordenadorPuntos <= 11) {
                    System.out.println("El ordenador ha igualado o superado tu puntuación. Suma 1 porra.");
                    ordenadorPorras++;
                }
            }
        }

        if (jugadorPorras >= 5) {
            System.out.println("¡Felicidades, el jugador ha ganado la partida con " + jugadorPorras + " porras!");
        } else {
            System.out.println("¡El ordenador ha ganado la partida con " + ordenadorPorras + " porras!");
        }

        teclado.close();
    }
}