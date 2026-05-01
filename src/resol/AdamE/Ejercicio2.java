package AdamE;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
         LocalDate fechaNacimiento = null;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("Cálculo de días vividos (sin ChronoUnit)");
        System.out.println("Introduce tu fecha de nacimiento (formato: yyyy-MM-dd):");
        
        while (fechaNacimiento == null) {
            try {
                fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Use yyyy-MM-dd (ej: 1990-05-20):");
            }
        }
        
        LocalDate hoy = LocalDate.now();
        
        // Método 1: usando toEpochDay() (no es ChronoUnit)
        long diasVividos = hoy.toEpochDay() - fechaNacimiento.toEpochDay();
        
        System.out.println("Naciste el: " + fechaNacimiento.format(formatter));
        System.out.println("Hoy es: " + hoy.format(formatter));
        System.out.println("Has vivido " + diasVividos + " días.");
        
        // Extra: también podrías mostrar años, meses y días aproximados
        System.out.println("(Aprox: " + (diasVividos / 365) + " años)");
        
    }
}
