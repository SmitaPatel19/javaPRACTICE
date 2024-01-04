import java.util.*;
public class Recursion_alternateSum {

    static int Calculate(int n){
        if(n==1){
            return 1;
        }
        int sum=0;

        if(n%2==0){
            sum =Calculate(n-1)-n;
        }
        else{
            sum = Calculate(n-1)+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter no. of terms : ");
        int n=scn.nextInt();

        System.out.println(Calculate(n));
    }
}
