import java.util.Scanner;
public class arrays2 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length ");
        int n = sc.nextInt();
        int X []=new int [n];
        System.out.println("enter the elements ");
        for (int i=0; i<n; i++)
        {
            X[i]= sc.nextInt();
        }
        sc.close();
        System.out.println();
        int minin =0;
        int maxin=0;
        for (int i=0; i<n; i++)
        {
            if (X[i]> X[maxin])
                maxin=i;
            if (X[i]< X[minin])
                minin=i;

        }
        int maxval = X[maxin];
        int minval = X[minin];

        System.out.println("maximum value:"+ maxval);
        System.out.println("minimum value:"+ minval);
    }
}