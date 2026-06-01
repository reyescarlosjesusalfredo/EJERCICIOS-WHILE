import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String claveCorrecta = "java123";
        String intento = "";
        
        while (!intento.equals(claveCorrecta)) {
            System.out.print("Introduce la contraseña: ");
            intento = entrada.nextLine();
            if (!intento.equals(claveCorrecta)) {
                System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            }
        }
        System.out.println("¡Acceso concedido!");
    }
}