package ejercicioonce;

import java.util.Scanner;

public class EjercicioOnce {

    //public static int n1,n2,n3;
    public static void main(String[] args) {
      // http://puntocomnoesunlenguaje.blogspot.com.es/2012/08/java-scanner.html  
      Scanner sc = new Scanner(System.in);
      int n1, n2, n3;
      System.out.print("Introduzca primer número: ");
      n1 = sc.nextInt();
      System.out.print("Introduzca segundo número: ");
      n2 = sc.nextInt();
      System.out.print("Introduzca tercer número: ");
      n3 = sc.nextInt();
      
      // Mayor
        if(n1 > n2)
           if(n1 > n3)
              System.out.println("El mayor es: " + n1);
           else
               // n1 no es el mayor
              fn1NoMayor(n2,n3);
        else 
            // n1 no es el mayor
            fn1NoMayor(n2,n3);
        
    // Menor
        if(n1 < n2)
        {
           if(n1 < n3)
              System.out.println("El menor es: " + n1);
        } 
        else
            // n1 no es el menor
               if(n2 < n3)
                    System.out.println("El menor es: " + n2);
               else
                    System.out.println("El menor es: " + n3); 
            
    }
    
    public static void fn1NoMayor(int n2,int n3)
    {
         if (n2 > n3)
            System.out.println("El mayor es: " + n2);
         else
            System.out.println("El mayor es: " + n3);
    }
}
   
  
