import java.util.*;
public class Recursion2_x_n {

    private static int Calculate(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        return x*Calculate(x, n-1);
    }

    public static int CalculatelogN(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        if(n%2==0){
            return CalculatelogN(x, n/2)*CalculatelogN(x, n/2);
        }
        else{
            return CalculatelogN(x, n/2)*CalculatelogN(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter x : ");
        int x=scn.nextInt();

        System.out.print("Enter n : ");
        int n=scn.nextInt();

        System.out.println("x^n : "+CalculatelogN(x,n));
        System.out.println("x^n : " + Calculate(x, n));
    }
}
