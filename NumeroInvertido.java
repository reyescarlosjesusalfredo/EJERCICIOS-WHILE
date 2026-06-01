import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();
        int invertido = 0;
        int aux = numero;
        
        while (aux != 0) {
            int digito = aux % 10;
            invertido = invertido * 10 + digito;
            aux /= 10;
        }
        System.out.println("Número invertido: " + invertido);
    }
}