import java.util.*;
public class Recursion2_factorial {

    public static int factorial(int n){
        if(n==0 || n==1){
            System.out.print("1 ");
            return 1;
        }

        int fact=n*factorial(n-1);
        System.out.print(fact + " ");
        return fact;

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=scn.nextInt();

        System.out.println("Fectorial Sequence : ");
        factorial(n);
    }    
}
