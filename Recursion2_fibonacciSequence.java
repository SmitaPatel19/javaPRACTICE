import java.util.*;
public class Recursion2_fibonacciSequence {

    private static void fibonacci(int a, int b,int n){
        if(n==0){
            return;
        }
        int fib=a+b;
        System.out.print(fib + " ");
        fibonacci(b, fib, n-1);
    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number to find sequence : ");
        int n=scn.nextInt();
        if (n == 0) {
            System.out.print(n + " ");
        }
        else if (n == 1) {
            System.out.print(n + " ");
        }
        else{
            int a = 0, b = 1;
            System.out.print("0 1 ");
            fibonacci(a, b, n);
        }
    }    
}
