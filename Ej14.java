import java.util.Random;

public class Ej14 {

    public static void main(String Args[]) {
        int dado = 0;
        int contadorUno = 0;
        int contadorDos = 0;
        int contadorTres = 0;
        int contadorCuatro = 0;
        int contadorCinco = 0;
        int contadorSeis = 0;
        
        Random rnd = new Random();
        int totalLanzamientos = 1000000;

        for (int i = 0; i < totalLanzamientos; i++) {
            dado = rnd.nextInt(6) + 1;

            switch (dado) {
                case 1:
                    contadorUno++;
                    break;
                case 2:
                    contadorDos++;
                    break;
                case 3:
                    contadorTres++;
                    break;
                case 4:
                    contadorCuatro++;
                    break;
                case 5:
                    contadorCinco++;
                    break;
                case 6:
                    contadorSeis++;
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }

        // Calcular porcentajes
        double porcentajeUno = (contadorUno / (double) totalLanzamientos) * 100;
        double porcentajeDos = (contadorDos / (double) totalLanzamientos) * 100;
        double porcentajeTres = (contadorTres / (double) totalLanzamientos) * 100;
        double porcentajeCuatro = (contadorCuatro / (double) totalLanzamientos) * 100;
        double porcentajeCinco = (contadorCinco / (double) totalLanzamientos) * 100;
        double porcentajeSeis = (contadorSeis / (double) totalLanzamientos) * 100;

        // Muestra por pantalla los resultados
        System.out.println("/// RESULTADOS ///");
        System.out.println("Total unos: " + contadorUno + " (" + porcentajeUno + "%)");
        System.out.println("Total doses: " + contadorDos + " (" + porcentajeDos + "%)");
        System.out.println("Total treses: " + contadorTres + " (" + porcentajeTres + "%)");
        System.out.println("Total cuatros: " + contadorCuatro + " (" + porcentajeCuatro + "%)");
        System.out.println("Total cincos: " + contadorCinco + " (" + porcentajeCinco + "%)");
        System.out.println("Total seises: " + contadorSeis + " (" + porcentajeSeis + "%)");
    }
}