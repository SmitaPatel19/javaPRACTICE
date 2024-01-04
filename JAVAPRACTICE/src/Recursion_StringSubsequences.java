import java.util.*;
public class Recursion_StringSubsequences {

    static ArrayList<String> Subsequences(String str){
        ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        ArrayList<String> smallans=Subsequences(str.substring(1));
        for(String s : smallans){
            ans.add(s);
            ans.add(str.charAt(0)+s);
        }
        return ans;
    }

    static void Subsequences2(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        String remString=str.substring(1);
        Subsequences2(remString, ans+str.charAt(0));
        Subsequences2(remString, ans);
    }
    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);

       System.out.print("Enter String : ");
       String s=scn.nextLine();

       ArrayList <String> ans=Subsequences(s);

       for(String st : ans){
            System.out.print(st+" ");
       }

       System.out.println();
       // without using arraylist
       Subsequences2(s,"");
    }    
}
