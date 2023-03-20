import java.util.Random;
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        int numeroIngresado;
        Scanner lectura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100) + 1;
        int intentos = 0;
        
       
        boolean acierto = false;

        System.out.println("Adivina un número entre 1 y 100. Tienes 10 intentos.");

        while (intentos < 10 && !acierto) {
            System.out.print("Intento #" + (intentos + 1) + ": ");
            numeroIngresado = lectura.nextInt();
            intentos++;

            if (numeroIngresado == numeroAleatorio) {
                acierto = true;
                System.out.println("¡Felicitaciones! Adivinaste el número en " + intentos + " intentos.");
            } else if (numeroIngresado > numeroAleatorio) {
                System.out.println("El número ingresado es mayor que el número a adivinar.");
            } else {
                System.out.println("El número ingresado es menor que el número a adivinar.");
            }
        }

        if (!acierto) {
            System.out.println("Lo siento, no lograste adivinar el número. El número era " + numeroAleatorio + ".");
        }

        lectura.close();
    }
}
