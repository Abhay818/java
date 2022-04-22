import java.util.Scanner;
public class arrays4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
       int evenArray[]=new int[10];
        int oddArray[]=new int[10];
        int a=0,b=0;
        System.out.println("Enter the elements for the array:");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<10;i++){
            if(arr[i]%2==0){
            evenArray[a]=arr[i];
            ++a;
        }
        else{
            oddArray[b]=arr[i];
            ++b;
        }
    }
       
   int lEven=a;
   int lOdd=b;
   
   System.out.println("Original Array");
   System.out.println("Length: 10");
   for(int i=0;i<10;i++){
       System.out.println(arr[i]);
    }
    
   System.out.println("Even numbers array:");
    System.out.println("Length:" + a);
   for(int j=0;j<lEven;j++){
       System.out.println(evenArray[j]);
    }
    System.out.println("Odd numbers array:");
      System.out.println("Length:" + b);
   for(int j=0;j<lOdd;j++){
       System.out.println(oddArray[j]);
    }
    

    sc.close();
}
}