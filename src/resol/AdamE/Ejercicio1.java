package AdamE;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Primera fecha y hora (formato: yyyy-MM-dd'T'HH:mm:ss):");
        //Ejemplo de formato: 2024-06-01T14:30:00
        LocalDateTime fecha1 = LocalDateTime.parse(scanner.nextLine());

        System.out.println("Segunda fecha y hora (mismo formato):");
        //Ejemplo de formato: 2024-06-01T14:30:12
        LocalDateTime fecha2 = LocalDateTime.parse(scanner.nextLine());

        if (fecha1.isAfter(fecha2)) {
            System.out.println("La primera es mayor.");
        } else if (fecha1.isBefore(fecha2)) {
            System.out.println("La segunda es mayor.");
        } else {
            System.out.println("Son iguales.");
        }

        //scanner.close();
    }
}
