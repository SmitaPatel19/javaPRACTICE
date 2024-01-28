import java.util.*;
public class reverseString_Recur_Loop {

    public static String newstr = "";

    public static StringBuilder ReverseLoop(String ustr,int len){
        
        StringBuilder str = new StringBuilder(ustr);
        // StringBuilder nstr = new StringBuilder("");

        for (int i = 0; i < len / 2; i++) {
            char frnt = str.charAt(i);
            char back = str.charAt(len - 1 - i);
            str.setCharAt(i, back);
            str.setCharAt(len - 1 - i, frnt);
        }

        return str;
    }

    public static String ReverseRecur(String str,int l){
    
        if(l<=0){
            return newstr;
        }
        //System.out.print(str.charAt(l-1));
        newstr =  newstr + str.charAt(l-1);
        return ReverseRecur(str, l-1);
    }

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        String ustr; 

        System.out.print("Enter String : ");
        ustr = scn.nextLine();

        int l=ustr.length();
        System.out.println("Reversed String by Loop : "+ReverseLoop(ustr, l));

        System.out.println("Reversed String by Recursion: "+ ReverseRecur(ustr, l));

        // System.out.print("Reversed String : ");
        // for (int i = 0; i < len; i++) {
        //     // System.out.print(nstr.charAt(i));
        //     System.out.print(str.charAt(i));
        // }

    }
    
}
