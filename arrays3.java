import java.util.Scanner;

public class arrays3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the elements for the array:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter a number to search:");
        int num = sc.nextInt();
        int st = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == num) {
                st = i;
                System.out.println("Index number of the entered element is: " + st);
                break;
            }
        }
        if (st == 0)
            System.out.println("Entered number cannot be find in the array.");
            sc.close();
    }
}