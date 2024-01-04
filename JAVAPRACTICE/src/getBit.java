import java.util.*;
public class getBit {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter element = ");
        int n=scn.nextInt();

        System.out.print("Enter bit to get : ");
        int b=scn.nextInt();

        int pos=b-1;

        int bitmask=1<<pos;

        int re=(n & bitmask);

        if(re==0){
            System.out.println("0 present at position"+pos);
        }
        else{
            System.out.println("1 present at position"+pos);
        }
    }   
}
