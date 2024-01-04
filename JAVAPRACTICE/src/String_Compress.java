import java.util.*;
public class String_Compress {
    
    static String Compressed(String str){
        String ans="";

        int count=0;
        int i=0;
        while(i<str.length()-1){
            char curr=str.charAt(i);
            if(curr==str.charAt(i+1)){
                count++;
            }
            else if(count!=0){
                count++;
                ans=ans+curr+count;
                count=0;
            }
            else{
                ans=ans+curr;
            }
            i++;
        }

        if(count!=0){
            count++;
            ans=ans+str.charAt(i)+count;
        }
        else{
            ans=ans+str.charAt(i);
            // count=0;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter String : ");
        String str=scn.nextLine();

        System.out.println(Compressed(str));
    }
}
