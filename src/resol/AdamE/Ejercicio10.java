package AdamE;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar(){
        String[] alumnos = new String[10];
        double[] notas = new double[10];
        String[] resultado = new String[10];
        System.out.println("Ingrese los nombres de los alumnos y sus notas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = new Scanner(System.in).nextLine();
            System.out.print("Nota de " + alumnos[i] + ": ");
            notas[i] = new Scanner(System.in).nextDouble(); 
        }
        
        for (int i = 0; i < 10; i++) {
            if(notas[i]>=0 && notas[i]<=4.99){
                resultado[i]=alumnos[i]+" "+notas[i]+ " suspenso.";
            }
            else if(notas[i]>=5 && notas[i]<=6.99){
                resultado[i]=alumnos[i]+" "+notas[i]+ " bien.";
            }
            else if(notas[i]>=7 && notas[i]<=8.99){
                resultado[i]=alumnos[i]+" "+notas[i]+ " notable.";
            }
            else if(notas[i]>=9 && notas[i]<=10){
                resultado[i]=alumnos[i]+" "+notas[i]+ " sobresaliente.";
            }
            else{
                resultado[i]=alumnos[i]+" "+notas[i]+ " nota no valida.";
            }
        }
        System.out.println("Resultados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(resultado[i]);
        }
    }
}
