import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int numero = -1;
        
        while (numero != 0) {
            System.out.print("Ingresa un número (0 para salir): ");
            numero = entrada.nextInt();
            if (numero > 0) {
                contador++;
            }
        }
        System.out.println("Cantidad de números positivos ingresados: " + contador);
    }
}