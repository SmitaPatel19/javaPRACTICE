import java.util.*;
public class BinarySearch_SquareRootSmall {

    static int SquareRootBasic(int n){
        int i=0;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }


    static int ans=-1;
    static int SquarerootBinary(int st,int en,int n){
        if(st>en){
            return ans;
        }
        int mid=st+(en-st)/2;
        int val=mid*mid;
        if(val==n){
            return mid;
        }
        else if(val>n){
            return SquarerootBinary(st, mid-1, n);
        }
        else{
            ans=mid;
            return SquarerootBinary(mid+1, en, n);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number to find square root : ");
        int n=scn.nextInt();

        System.out.println("Square root by basic : "+SquareRootBasic(n));
        System.out.println("Square root by binary search : "+SquarerootBinary(0,n,n));
        
    }    
}
