package AdamE;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        LocalDate fechaNacimiento = null;//2 horas y no me di cuenta que coloque un * en vez de un - en la consola jajajajaja
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("¿Qué día de la semana naciste?");
        System.out.println("Introduce tu fecha de nacimiento (formato: yyyy-MM-dd):");
        
        while (fechaNacimiento == null) {
            try {
                fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato incorrecto. Use yyyy-MM-dd (ej: 1990-05-20):");
            }
        }
        
        // Obtener el día de la semana
        java.time.DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();
        
        // Mostrar resultado (en español)
        String nombreDia = traducirDia(diaSemana);
        
        System.out.println("\nNaciste el: " + fechaNacimiento.format(formatter));
        System.out.println("Día de la semana: " + nombreDia + " (" + diaSemana + ")");
        
    }
      private static String traducirDia(java.time.DayOfWeek dia) {
        switch (dia) {
            case MONDAY:    return "Lunes";
            case TUESDAY:   return "Martes";
            case WEDNESDAY: return "Miércoles";
            case THURSDAY:  return "Jueves";
            case FRIDAY:    return "Viernes";
            case SATURDAY:  return "Sábado";
            case SUNDAY:    return "Domingo";
            default:        return dia.toString();



        }
    }
  
}
