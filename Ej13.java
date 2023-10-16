import java.util.Random;

public class Ej13 {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        int totalLanzamientos = 1000000; // Total de lanzamientos
        int caras = 0;  // Contador para caras
        int cruces = 0;  // Contador para cruces

        // Simular lanzamiento de la moneda y contar caras y cruces
        for (int i = 0; i < totalLanzamientos; i++) {
            // Generar un número aleatorio (0 o 1)
            int resultadoLanzamiento = aleatorio.nextInt(2);

            // Si el resultado es 0, es cara; si es 1, es cruz
            if (resultadoLanzamiento == 0) {
                caras++;
            } else {
                cruces++;
            }
        }

        // Calcular porcentajes
        double porcentajeCaras = (caras / (double) totalLanzamientos) * 100;
        double porcentajeCruces = (cruces / (double) totalLanzamientos) * 100;

        // Mostrar resultados
        System.out.println("Porcentaje de caras: " + porcentajeCaras + "%");
        System.out.println("Porcentaje de cruces: " + porcentajeCruces + "%");
    }
}