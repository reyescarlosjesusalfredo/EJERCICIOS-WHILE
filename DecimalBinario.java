import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número decimal entero: ");
        int decimal = entrada.nextInt();
        String binario = "";
        
        if (decimal == 0) {
            binario = "0";
        } else {
            while (decimal > 0) {
                int residuo = decimal % 2;
                binario = residuo + binario;
                decimal /= 2;
            }
        }
        System.out.println("El número en binario es: " + binario);
    }
}