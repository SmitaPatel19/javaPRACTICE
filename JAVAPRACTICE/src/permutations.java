import java.util.*;
public class permutations {

    //time complexity = O(n*n!)

    public static void perm(String str,int n,String perm){
        if(str.length()==0){
            System.out.print(perm+"  ");
            return;
        }

        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring((i+1));
            perm(newstr,n+1,perm+current);
        }
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter string : ");
        String str=scn.nextLine();
        String perm="";
        System.out.println("Permutation combinations are : ");
        perm(str,0,perm);
    }

}