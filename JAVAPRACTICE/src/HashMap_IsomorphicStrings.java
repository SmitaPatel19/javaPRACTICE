import java.util.*;
public class HashMap_IsomorphicStrings {
    public static void main(String[] args) {
        
        String s="egg";
        String t="add";

        HashMap<Character,Character> mp=new HashMap<>();

        for(int i=0;i<s.length();i++){ //O(n)
            char chs=s.charAt(i);
            char cht=t.charAt(i);

            if(mp.containsKey(chs)){ //O(1)
                if(mp.get(chs)!=cht){
                    System.out.println("Not Isomorphic");
                    return;
                }
            }
            else if(mp.containsValue(cht)){ //O(n)
                System.out.println("Not Isomorphic");
                return;
            }
            else{
                mp.put(chs, cht);
            }
        }

        System.out.println("Is Isomorphic");
        return;
    }    
}
