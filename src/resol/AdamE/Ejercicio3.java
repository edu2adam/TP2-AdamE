package AdamE;
import java.time.Duration;
import java.time.LocalTime;

public class Ejercicio3 {
    public static void ejecutar(){
        
         // Definir hora de inicio y fin
        LocalTime inicioActividad = LocalTime.of(7, 0);   // 07:00
        LocalTime finActividad = LocalTime.of(15, 0);     // 15:00
        
        // Calcular duración en minutos usando Duration
        Duration duracion = Duration.between(inicioActividad, finActividad);
        long minutos = duracion.toMinutes();
        
        // Mostrar resultado
        System.out.println("Horario de la actividad:");
        System.out.println("Inicio: " + inicioActividad);
        System.out.println("Fin: " + finActividad);
        System.out.println("La jornada dura " + minutos + " minutos.");
        
        // Opcional: mostrar también en horas y minutos
        long horas = duracion.toHours();
        long minutosRestantes = minutos % 60;
        System.out.println("(" + horas + " horas y " + minutosRestantes + " minutos)");

    }

}
