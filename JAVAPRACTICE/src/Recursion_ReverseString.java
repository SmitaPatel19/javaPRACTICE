import java.util.*;
public class Recursion_ReverseString {

    static String Reverse(String str,int idx){
        if(idx==str.length()){
            return "";
        }
        String smallAns=Reverse(str, idx+1);
        return smallAns + str.charAt(idx);
    }


    static String Reverse2(String str){
        if(str.length()==0){
            return "";
        }
        String smallAns=Reverse2(str.substring(1));
        return smallAns + str.charAt(0);
    }

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter String : ");
        String s = scn.nextLine();

        
        System.out.println("After reversing : " + Reverse(s, 0));
        System.out.println("After reversing : " + Reverse2(s));
    }    
}
