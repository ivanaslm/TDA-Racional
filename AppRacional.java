package CYL;
import java.util.Scanner;


public class AppRacional {
     public static void main (String args[]){
     int numerador,denominador;
     Scanner token = new Scanner(System.in);
     token.useDelimiter("\n");
     
     
        Racional r1, r2, r3;
        
     
         System.out.println("SUMATORIA DE RACIONALES");
         System.out.println("Introduce el numerador del racional 1");
         numerador= token.nextInt();
         System.out.println("Introduce el denominador del racional 1");
         denominador= token.nextInt();  
         r1= new Racional(numerador, denominador);
         
         
         System.out.println("Introduce el numerador del racional 2");
         numerador= token.nextInt();
         System.out.println("Introduce el denominador del racional 2");
         denominador= token.nextInt();
         r2= new Racional(numerador, denominador);
         
         r3= new Racional(numerador, denominador);
         System.out.println("La sumatoria de los racionales es:"+r3.suma(r1, r2));
          System.out.println("El resultado simplificado es:"+r3.simplificar(r1, r2));
         //System.out.println("La resta de los racionales es:"+r3.resta(r1, r2));
         //System.out.println("El resultado simplificado es:"+r3.simplificar(r1, r2));
     
     
     
     }//main
}//class
