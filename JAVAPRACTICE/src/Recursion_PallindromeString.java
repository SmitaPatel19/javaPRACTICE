import java.util.*;
public class Recursion_PallindromeString {

    static boolean Pallindrome(String str,int st,int en){
        if(st>=en){
            return true;
        }
        return ((str.charAt(st)==str.charAt(en)) && (Pallindrome(str, st+1, en-1)));
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = scn.nextLine();

        System.out.println("String is Pallindrome : " + Pallindrome(s, 0,s.length()-1));
    }    
}
