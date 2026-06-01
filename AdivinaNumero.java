import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento = 0;
        
        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = entrada.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            }
        }
        System.out.println("¡Felicidades! Adivinaste el número.");
    }
}