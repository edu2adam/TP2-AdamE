package AdamE;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el monto total (múltiplo de 10): ");
        int monto = scanner.nextInt();
        
        
        if (monto % 10 != 0) {
            System.out.println("El monto debe ser múltiplo de 10.");
            return;
        }
        
        
        int[] billetes = {20000, 10000, 1000, 500, 200, 100, 50, 20, 10};
        
        System.out.println("Para el monto $" + monto + " se necesita:");
        
        for (int billete : billetes) {
            int cantidad = monto / billete;
            if (cantidad > 0) {
                System.out.println(cantidad + " billete(s) de $" + billete);
                monto %= billete; 
            }
        }
        
       
    }
}