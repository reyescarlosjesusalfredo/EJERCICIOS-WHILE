import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();
        int suma = 0;
        int aux = Math.abs(numero);
        
        while (aux > 0) {
            suma += aux % 10;
            aux /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}