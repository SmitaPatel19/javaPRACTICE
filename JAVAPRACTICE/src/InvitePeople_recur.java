import java.util.*;
public class InvitePeople_recur {

    public static int invite(int n){
        int nw;
        if(n<=1){
            return 1;
        }

        int nwsing=invite(n-1);
        int nwpair=(n-1)*invite(n-2);

        nw=nwsing + nwpair;

        return nw;
    }

    public static void main(String[] args) {
        
        Scanner scn=new Scanner (System.in);

        System.out.print("no. of peoples : ");
        int n=scn.nextInt();

        int x=invite(n);
        System.out.println("No. of ways : "+ x);
    }
}
