import java.util.*;
public class Recursion_Fibonacci {

    static int Calculate(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f=Calculate(n-1)+Calculate(n-2);
        return f;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=scn.nextInt();

        System.out.println("Fibonacci : "+Calculate(n));
    }    
}
