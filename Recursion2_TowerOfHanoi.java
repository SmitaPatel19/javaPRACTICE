import java.util.*;
public class Recursion2_TowerOfHanoi {

    public static void TowerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("Transfer plate "+n+" from "+src+" to "+dest);
            return;
        }

        TowerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer plate " + n + " from " + src + " to " + dest);
        TowerOfHanoi(n-1, help, src, dest);
    }

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number of plates : ");
        int n=scn.nextInt();

        TowerOfHanoi(n,"S","H","D");
    }    
}
