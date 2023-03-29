import java.util.Scanner;

public class reto2_1 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("cuantos competidores son ");
        int cantidadCompetidores = lectura.nextInt();
        
        String[] nombres = new String[cantidadCompetidores];
        double[] tiempos = new double[cantidadCompetidores];
        
        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.print(" nombre del competidor  " + (i+1));
            nombres[i] = lectura.next();
            System.out.print(" tiempo en segundos del competidor  " + (i+1) );
            tiempos[i] = lectura.nextDouble();
        }
        
        System.out.println("Competidores y tiempos:");
        for (int i = 0; i < cantidadCompetidores; i++) {
            System.out.println(nombres[i] + " - " + tiempos[i] + " segundos");
        }
        
        int Ganador = 0;
        for (int i = 1; i < cantidadCompetidores; i++) {
            if (tiempos[i] < tiempos[Ganador]) {
                Ganador = i;
            }
        }
        System.out.println("El ganador de la competencia es " + nombres[Ganador] + " con un tiempo de " + tiempos[Ganador] + " segundos.");
        lectura.close();
    }
}
