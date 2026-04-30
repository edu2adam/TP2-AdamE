package AdamE;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        LocalDate nacimiento = null;//SIendo honestos estoy haciendo esto de esta manera porque tarde como 
        //2 horas en darme cuenta en el anterior porque se me rompia el programa al poner una fecha equivocada 
        //y todo porque no me di cuenta que estaba colocando un * en vez de un -
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.println("Días hasta tu próximo cumpleaños");
        System.out.print("Ingresa tu fecha de nacimiento (yyyy-MM-dd): ");
        
        while (nacimiento == null) {
            try {
                nacimiento = LocalDate.parse(scanner.nextLine(), formatter);
            } catch (DateTimeParseException e) {
                System.out.print("Formato inválido. Reingresa (yyyy-MM-dd): ");
            }
        }
        
        LocalDate hoy = LocalDate.now();
        LocalDate proximoCumple = LocalDate.of(hoy.getYear(), nacimiento.getMonth(), nacimiento.getDayOfMonth());
        
        if (proximoCumple.isBefore(hoy)) {
            proximoCumple = proximoCumple.plusYears(1);
        }
        
        long diasFaltan = proximoCumple.toEpochDay() - hoy.toEpochDay();
        
        System.out.println("\nHoy: " + hoy);
        System.out.println("Próximo cumpleaños: " + proximoCumple);
        System.out.println("Faltan " + diasFaltan + " días.");
        
        if (diasFaltan == 0) System.out.println("¡Feliz cumpleaños!");
    }
}