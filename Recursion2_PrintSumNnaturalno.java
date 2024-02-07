import java.util.*;
public class Recursion2_PrintSumNnaturalno {

    private static int Sum(int n, int sum){
        if(n == 0){
            return 0;   
        }
        
        sum = n + Sum(n-1, sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=scn.nextInt();
        
        int sum=0;
        System.out.println("Sum : "+ Sum(n, sum));
    }    
}
