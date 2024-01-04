import java.util.*;
public class Reecursion_removeOcurr_String {

    static String Remove(String str,int idx,char ch){
        if(idx==str.length()){
            return "";
        }
        String smallans=Remove(str, idx+1, ch);
        if(str.charAt(idx)!=ch){
            return str.charAt(idx)+smallans;
        }else{
            return smallans;
        }
    }

    static String Remove2(String str,char ch){
        if(str.length()==0){
            return "";
        }
        String smallAns=Remove2(str.substring(1), ch);
        if(str.charAt(0)!=ch){
            return str.charAt(0)+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);

        System.out.print("Enter String : ");
        String s=scn.nextLine();

        System.out.print("Enter character to remove : ");
        char ch=scn.next().charAt(0);
        System.out.println("After removing : "+Remove(s,0,ch));
        System.out.println("After removing : "+Remove2(s,ch));
    }    
}
