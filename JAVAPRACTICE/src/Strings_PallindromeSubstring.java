import java.util.*;
public class Strings_PallindromeSubstring {

    static boolean CheckPallindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int Pallindrome(String str){

        int count=0;
        System.out.print("Pallindromic Substrings are : ");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(CheckPallindrome(str.substring(i, j))==true){
                    System.out.print(str.substring(i, j)+" ");
                    count++;
                }
            }
        }
        System.out.println();
        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String : ");
        String str=scn.nextLine();

        System.out.println("Number of substrings which are pallindrome : "+Pallindrome(str));
    }    
}
