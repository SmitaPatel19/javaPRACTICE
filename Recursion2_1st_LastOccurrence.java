import java.util.*;
public class Recursion2_1st_LastOccurrence {

    private static int first=-1;
    private static int last=-1;

    private static void First_Last_Ocurrence(String str,int idx,char elem){
        if(idx==str.length()){
            System.out.println("First Ocurrence : "+first);
            System.out.println("Last Ocurrenece : "+last);
            return;
        }

        char  ch=str.charAt(idx);
        if(ch==elem){
            if(first==-1){
                first = idx;
                last = idx;
            }
            else{
                last=idx;
            }
        }

        First_Last_Ocurrence(str, idx+1, elem);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String : ");
        String str=scn.nextLine();

        System.out.print("Enter character to find occurrence : ");
        char ch=scn.next().charAt(0);

        First_Last_Ocurrence(str,0,ch);
    }    
}
