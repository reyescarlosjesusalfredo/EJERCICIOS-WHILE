import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número (0 para terminar): ");
        int numero = entrada.nextInt();
        
        if (numero == 0) {
            System.out.println("No ingresaste ningún número inicial.");
            return;
        }
        
        int menor = numero;
        while (numero != 0) {
            if (numero < menor) {
                menor = numero;
            }
            System.out.print("Ingresa otro número (0 para terminar): ");
            numero = entrada.nextInt();
        }
        System.out.println("El menor número ingresado fue: " + menor);
    }
}