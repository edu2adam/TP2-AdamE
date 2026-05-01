package AdamE;
import java.util.Scanner;

public class Ejercicio8 {
    
    
    public static double carreteraNormalKM(double litros) {
        double consumoPorKm = litros*(100.0/8.0);//No puedo creer que por poner 100/8 no era lo mismo que 100.0/8.0;
        return consumoPorKm;
    }
    
    
    public static double carreteraDesigualKM(double consumoNormal) {

        double consumoPorKmDesigual = consumoNormal /1.15;
        return consumoPorKmDesigual;
    }
    
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese cuántos litros tiene el tanque de combustible: ");
        double litros = scanner.nextDouble();
        
        double normal = carreteraNormalKM(litros);
        double desigual = carreteraDesigualKM(normal);
        
        System.out.printf("Kilómetros en carretera normal: "+ normal +" KM\n");
        System.out.printf("Kilómetros en carretera desigual: "+ desigual +" KM\n");
        
        
    }
}