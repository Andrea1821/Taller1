import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¡Hola! ¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        if (!nombre.isEmpty()) {
            System.out.println("¡Bienvenido, " + nombre + "!");
            System.out.println("Es un placer saludarte.");
        } else {
            System.out.println("No ingresaste un nombre válido. ¡Hasta luego!");
        }

        scanner.close();
    }
}

