import java.util.*;
public class Recursion2_subsequencesOfString {

    // time = O(2^n)

    private static void PrintSubsequences(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.print(newString+" ");
            return;
        }

        char ch=str.charAt(idx);
        PrintSubsequences(str, idx+1, newString+ch);
        PrintSubsequences(str, idx+1, newString);
    }

    private static HashSet UniqueSubsequence(String str, int idx,String newString,HashSet<String> st){
        if(idx==str.length()){
            if(st.contains(newString)){
                return st;
            }
            else{
                st.add(newString);
                return st;
            }
        }

        char ch=str.charAt(idx);
        UniqueSubsequence(str, idx+1, newString+ch, st);
        UniqueSubsequence(str, idx+1, newString, st);
        return st;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str=scn.next();

        PrintSubsequences(str,0,"");
        System.out.println();

        HashSet<String> st=new HashSet<>();
        System.out.println("Unique Subsequences : "+UniqueSubsequence(str, 0, "", st));
    }    
}
