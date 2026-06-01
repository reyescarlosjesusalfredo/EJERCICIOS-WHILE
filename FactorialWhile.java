import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int n = entrada.nextInt();
        long factorial = 1;
        int i = 1;
        
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}