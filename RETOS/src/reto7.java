import java.util.Random;
import java.util.Scanner;

public class reto7 {
    public static void main(String[] args) {
        String nombreJugador;
        double saldo =0;
        int jugadaJugador;
        int cant=0;
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Por favor, introduce tu nombre: ");
        nombreJugador = lectura.nextLine();
        System.out.print("cuantas veces desea jugar ");
        cant = lectura.nextInt();
        for (int i = 1; i <= cant; i++){   
            System.out.print("Por favor, introduce la cantidad de dinero que quieres apostar: ");
            double apuestaJugador = lectura.nextDouble();
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
                    saldo = 0+ganancia;
                } else {
                    double perdida = apuestaJugador;
                    System.out.println(nombreJugador + " has perdido " + perdida);
                    saldo = 0+perdida;
                }
            
            } else {
                System.out.println(nombreJugador+" La apuesta debe ser mayor a 10.000.");
            }
        } 
        System.out.println(nombreJugador+" tu saldo final es "+saldo);
        lectura.close(); 
    }

}