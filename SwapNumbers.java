import java.util.Scanner;

public class SwapNumbers {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value of A:");
        int a= scan.nextInt();
        System.out.println("Enter value of B:");
        int b= scan.nextInt();
        System.out.println("Values before swapping:");
        System.out.println("A="+a);
        System.out.println("B="+b);

        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("values after swapping:");
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
