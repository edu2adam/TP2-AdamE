package AdamE;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio5 {
    
    public static void ejecutar() {
        // Obtener fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        
        // Determinar el próximo 25 de junio a las 19:20
        int añoActual = ahora.getYear();
        LocalDateTime examen = LocalDateTime.of(añoActual, 6, 25, 19, 20);
        
        // Si ya pasó, pasar al año siguiente
        if (examen.isBefore(ahora)) {
            examen = examen.plusYears(1);
        }
        
        // Calcular tiempo restante
        Duration tiempoRestante = Duration.between(ahora, examen);
        long dias = tiempoRestante.toDays();
        long horas = tiempoRestante.toHours() % 24;
        long minutos = tiempoRestante.toMinutes() % 60;
        long segundos = tiempoRestante.getSeconds() % 60;
        
        // Contar clases (jueves) hasta el examen (sin incluir el día del examen)
        long clases = contarJueves(ahora.toLocalDate(), examen.toLocalDate());//Tengo que dejar de complicarme tanto la vida
        
        // Formatear fechas para mostrar
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Fecha/hora actual: " + ahora.format(formatter));
        System.out.println("Fecha del parcial: " + examen.format(formatter));
        System.out.println("\n Tiempo restante:");
        System.out.printf("   %d días, %d horas, %d minutos, %d segundos\n", dias, horas, minutos, segundos);
        System.out.println("\n Clases (jueves) hasta el parcial: " + clases);
        
        if (clases == 0) {//No se para que me puse a personalizar el mensaje pero bueno
            System.out.println("  No quedan clases antes del examen.");//Digo podria haber dicho "quedan " + clases + "clases antes del examen" y si era 0 pues tampoco estaba tan mal
        } else if (clases == 1) {
            System.out.println(" Te queda 1 clase.");
        } else {
            System.out.println(" Te quedan " + clases + " clases.");
        }//No vuelvo a tomar más 3 cafe antes de una presentación
        
    }
    
    // Cuenta los jueves desde (incluido) start hasta (excluido) end
    private static long contarJueves(LocalDate start, LocalDate end) {
        if (start.isAfter(end) || start.isEqual(end)) {
            return 0;
        }
        long count = 0;
        LocalDate fecha = start;
        while (fecha.isBefore(end)) {
            if (fecha.getDayOfWeek() == DayOfWeek.THURSDAY) {
                count++;
            }
            fecha = fecha.plusDays(1);
        }
        return count;
    }
}