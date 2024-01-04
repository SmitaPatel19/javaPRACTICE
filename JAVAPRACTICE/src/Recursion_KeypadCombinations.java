import java.util.*;
public class Recursion_KeypadCombinations {

    static void Combinations(String digstr,String[] keypd,String ans){
        if(digstr.length()==0){
            System.out.print(ans+" ");
            return;
        }
        
        int curridx=digstr.charAt(0)-'0';
        String currnumstr = keypd[curridx];
        for(int i=0;i<currnumstr.length();i++){
            Combinations(digstr.substring(1), keypd, ans+currnumstr.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String of numbers : ");
        String str=scn.nextLine();

        String keypd[]={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        Combinations(str,keypd,"");
    }    
}
