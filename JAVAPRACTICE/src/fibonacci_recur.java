import java.util.*;
public class fibonacci_recur {

    public static int fibonacci(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibo=fibonacci(n-1)+fibonacci(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number of elements = ");
        int n=scn.nextInt();

        System.out.println("fibonacci at enetered element is : "+fibonacci(n-1));

        System.out.println("Fibonacci series : ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }    
}
