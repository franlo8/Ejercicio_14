// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Ejercicio14 {
    public static void main(String[] args) {
        double n, cuadradon, cubon;
        Scanner leerporteclado = new Scanner(System.in);
        
        
        System.out.println("Ingrese el numero ");
        n = leerporteclado.nextDouble();
        cuadradon =n*n;
        cubon = n*n*n;
        System.out.println("El cuadrado de " + n + " es " + cuadradon);
        
        System.out.println("El cubo de " + n + " es " + cubon);
        
    }
}