import java.util.*;
public class SetBit {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner (System.in);

        System.out.println("Enter number : ");
        int n=scn.nextInt();

        System.out.println("Enter which bit to set : ");
        int b=scn.nextInt();

        int pos=b-1;

        int bitmask=1<<pos;
        System.out.println("New number : "+ (n | bitmask));

    }    
}
