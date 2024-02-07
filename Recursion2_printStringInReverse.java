import java.util.*;
public class Recursion2_printStringInReverse {

    private static void ReverseString(int n,String str){
        if(n<0){
            return;
        }

        System.out.print(str.charAt(n));
        ReverseString(n-1, str);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String : ");
        String str=scn.nextLine();

        ReverseString(str.length()-1,str);

    }    
}
