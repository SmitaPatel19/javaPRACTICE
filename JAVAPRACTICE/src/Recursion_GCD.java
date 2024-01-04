import java.util.*;
public class Recursion_GCD {

    static int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int x=scn.nextInt();
        System.out.print("Enter 2nd number : ");
        int y=scn.nextInt();
        
        System.out.println("GCD is : "+GCD(x,y));
    }    
}
