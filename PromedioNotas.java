import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double nota = 0;
        
        while (nota != -1) {
            System.out.print("Ingresa una nota (-1 para terminar): ");
            nota = entrada.nextDouble();
            if (nota != -1) {
                suma += nota;
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("El promedio de notas es: " + (suma / contador));
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}