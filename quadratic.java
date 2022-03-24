import java.util.Scanner;
import java.lang.Math;

public class quadratic {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter a: ");
        int a= sc.nextInt();
        if (a==0) {
            System.out.println("the equation is not quadratic ");
        
            
        }

        System.out.println("enter b: ");
        int b= sc.nextInt();

        System.out.println("enter c: ");
        int c= sc.nextInt();

        double D= b*b-4*a*c;
        double Dsqrt, x1,x2;
        Dsqrt= Math.sqrt(D);

        if (D>0) {
            x1=(-b+Dsqrt)/2*a;
            x2=(-b-Dsqrt)/2*a;
            System.out.println("roots of the quadratic equation are : \nx1= " + x1 + "nx2= " + x2);

        } 
         else if (D==0) {
             x1=-b/2*a;
             System.out.println("rooots are: \nx1="+x1 );

         }
         else {
             System.out.println("the equation has no real roots ");
         }
sc.close();
         }
          
}
        
    

