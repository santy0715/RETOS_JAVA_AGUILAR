import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        int totalProductos = 0;
        int cantidadProductos=0;
        double totalVenta = 0;
        double precioProducto;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos que comprara");
        cantidadProductos = lectura.nextInt();
        
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Ingrese el precio del producto  " + i);
            precioProducto = lectura.nextDouble();
            totalProductos++;
            totalVenta += precioProducto;
        }
        
        System.out.println("El total de productos comprados es " + totalProductos);
        System.out.println("El total a pagar es: $" + totalVenta);
       lectura.close(); 
    }
}
