import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
    
        String nombreBebe;
        String nombreMa;
        double pesoBebe;
        double mesesBebe;


        System.out.println ("ingrese el nombre del bebe");
        nombreBebe = lectura.nextLine();
        System.out.println ("ingrese el nombre de la mama");
        nombreMa = lectura.nextLine();
        System.out.print ("ingrese el peso del bebe");
        pesoBebe = lectura.nextDouble();
        System.out.print ("ingrese los meses del bebe");
        mesesBebe = lectura.nextDouble();




        System.out.print (nombreBebe +" su dosis es: "+ ((pesoBebe+10)/(mesesBebe*10)*8)+" Y el nombre de la madre es "+nombreMa);
        lectura.close();

}
}
