import java.util.Random;
import java.util.Scanner;

public class reto4 {

    public static void main(String[] args) {
        String nombreJugador;
        double apuestaJugador;
        int jugadaJugador;
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Por favor, introduce tu nombre: ");
        nombreJugador = lectura.nextLine();

        System.out.print("Por favor, introduce la cantidad de dinero que quieres apostar: ");
        apuestaJugador = lectura.nextDouble();
        if (apuestaJugador >= 10000) {
    
            int jugadaComputadora = random.nextInt(3);

            System.out.print("Por favor, introduce tu jugada (0 = Piedra, 1 = Papel, 2 = Tijera): ");
            jugadaJugador = lectura.nextInt();

            String[] jugadas = {"Piedra", "Papel", "Tijera"};
            System.out.println(nombreJugador + " ha jugado " + jugadas[jugadaJugador] + ".");
            System.out.println("La computadora ha sacado " + jugadas[jugadaComputadora] + ".");

            if (jugadaJugador == jugadaComputadora) {
                System.out.println("¡Ha habido un empate!");
            } else if (jugadaJugador == 0 && jugadaComputadora == 2 || jugadaJugador == 1 && jugadaComputadora == 0 || jugadaJugador == 2 && jugadaComputadora == 1) {
                double ganancia = apuestaJugador;
                System.out.println(nombreJugador + " has ganado " + ganancia);
            } else {
                double perdida = apuestaJugador;
                System.out.println(nombreJugador + " has perdido " + perdida);
            }
        
        } else {
            System.out.println(nombreJugador+" La apuesta debe ser mayor a 10.000.");
        }
        lectura.close();
      }  
}


