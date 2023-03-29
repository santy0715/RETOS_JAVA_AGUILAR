import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) 
    {
            String nombre;
            int apuesta=0;
            int cara;
            int rep=0; 
            Scanner lectura = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            nombre = lectura.nextLine();
            System.out.print("Ingrese su apuesta (mayor a 10.000) ");
            apuesta=lectura.nextInt();
            System.out.print("cuantas veces desea tirar");
            rep=lectura.nextInt();
            for (int i = 1; i <= rep; i++){
                if (apuesta >= 10000) {
                        System.out.print("cara (1) / sello (2) ? ");
                        cara = lectura.nextInt();
                        if (cara == 1) {
                            Boolean caras = true;
                            int resultado;
                            caras = Math.random() < 0.5;
                            String resultadoMensaje;
                                if (caras) {
                                    resultado = apuesta;
                                    resultadoMensaje = "ganar";
                                    System.out.println("cayo cara "+nombre + ", acabas de  " + resultadoMensaje + " " + Math.abs(resultado) + " pesos.");
                                
                                } else {
                                    resultado = -apuesta;
                                    resultadoMensaje = "perder";
                                    System.out.println("cayo sello "+nombre + ", acabas de  " + resultadoMensaje + " " + Math.abs(resultado) + " pesos.");
                                    }
                        }else {
                        boolean caras = false;
                            int resultado;
                            caras = Math.random() < 0.5;
                            String resultadoMensaje;
                                if (caras) {
                                    resultado = apuesta;
                                    resultadoMensaje = "ganar";
                                    System.out.println("cayo sello "+nombre + ", acabas de " + resultadoMensaje + " " + Math.abs(resultado) + " pesos.");
                            
                                } else {
                                    resultado = -apuesta;
                                    resultadoMensaje = "perder";
                                    System.out.println("cayo cara "+nombre + ", acabas de " + resultadoMensaje + " " + Math.abs(resultado) + " pesos.");
                                }
                            
                        }
                } else {
                    System.out.println(nombre+" La apuesta debe ser mayor a 10.000.");
                }
            }  
            lectura.close(); 
    }  
}
