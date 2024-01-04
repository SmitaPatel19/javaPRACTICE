import java.util.*;

public class Recursion_multiples {

    static void Calculate(int n,int k){
        //int i=1;
        if(k==0){
            return ;
        }
        Calculate(n, k-1);
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n= scn.nextInt();
        System.out.print("Enter number of multiples : ");
        int k=scn.nextInt();

        Calculate(n,k);
    }    
}
