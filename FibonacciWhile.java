import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos términos de la serie deseas generar?: ");
        int n = entrada.nextInt();
        int a = 0, b = 1, i = 1;
        
        System.out.print("Serie Fibonacci: ");
        while (i <= n) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
            i++;
        }
        System.out.println();
    }
}