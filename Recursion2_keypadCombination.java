import java.util.*;

public class Recursion2_keypadCombination {
    
    //time = O(4^n)
    
    private static String keypad[]={".","abc","def","ghi", "jkl","mno", "pqrs","tu","vwx","yz"};

    private static void PrintKeypadCombi(String  str, int idx, String combi){

        if(idx==str.length()){
            System.out.print(combi+" ");
            return;
        }

        char currch=str.charAt(idx);
        int ascii_w=currch-48;
    
        String keypadComb=keypad[ascii_w];

        for(int i=0;i<keypadComb.length();i++){

            char ch=keypadComb.charAt(i);
            PrintKeypadCombi(str, idx+1, combi+ch);
        }
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = scn.next();

        System.out.print("Keypad Combinations : ");
        PrintKeypadCombi(str,0,"");
    }
}
