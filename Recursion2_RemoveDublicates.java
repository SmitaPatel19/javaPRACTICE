import java.util.*;
public class Recursion2_RemoveDublicates {

    private static boolean visited[] = new boolean[26];

    private static void RemoveDublicates(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println("After removing : "+newstr);
            return;
        }

        char ch=str.charAt(idx);
        if(visited[ch-'a']==false){
            newstr=newstr+ch;
            visited[ch-'a']=true;
        }
        RemoveDublicates(str, idx+1, newstr);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String : ");
        String str=scn.nextLine();

        RemoveDublicates(str,0,"");
    }    
}
