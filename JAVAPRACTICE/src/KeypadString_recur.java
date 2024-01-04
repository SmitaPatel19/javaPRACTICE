import java.util.*;
public class KeypadString_recur {

    public static String keypad[]={".","abc","def","ghi","jkl","mno","pgrs","tu","vwx","yz"};

    public static void PrintKeypadcomb(String n,int idx,String comb){

        if(idx==n.length()){
            System.out.print(comb+" ");
            return;
        }
        char fn=n.charAt(idx);
        String current=keypad[fn-'0'];

        for(int i=0;i<current.length();i++){
            PrintKeypadcomb(n, idx+1, comb+current.charAt(i));
        }
    }
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n : ");
        String n=scn.nextLine();

        String comb="";
        System.out.print("combinations possible are : ");
        PrintKeypadcomb(n,0,comb);
    }
    
}
