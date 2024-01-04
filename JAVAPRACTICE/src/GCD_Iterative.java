import java.util.*;
public class GCD_Iterative {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int x=scn.nextInt();
        System.out.print("Enter 2nd number : ");
        int y=scn.nextInt();

        while(x%y != 0 ){
            int rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println("GCD id : "+y);
    }    
}
