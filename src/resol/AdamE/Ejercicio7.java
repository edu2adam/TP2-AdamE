package AdamE;
import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        System.out.println("Ingrese la altura (n) del triangulo");
        int altura = new Scanner(System.in).nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

}
