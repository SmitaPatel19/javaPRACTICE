import java.util.*;

public class HashMap_AnagramString {

    static HashMap<Character, Integer> makeMap(String s) {
        HashMap<Character, Integer> mps = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (mps.containsKey(ch)) {
                int currfreq = mps.get(ch);
                mps.put(ch, currfreq + 1);
            } else {
                mps.put(ch, 1);
            }
        }

        return mps;
    }

    public static void main(String[] args) {

        String s = "silent";
        String t = "listen";

        if(s.length()!=t.length()){
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character,Integer> mps=makeMap(s);

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!mps.containsKey(ch)){
                System.out.println("Not a Anagram");
                return;
            }
            else{
                int currfreq=mps.get(ch);
                mps.put(ch, currfreq-1);
                // we can do this also that if freq becomes 0 then remove key and its value.
            }
        }

        for(int i: mps.values()){
            if(i!=0){
                System.out.println("Not a Anagram");
                return;
            }
            else{
                System.out.println("Is a Anagram");
            }
        }
        // HashMap<Character, Integer> mpt = makeMap(t);

        // if(mps.equals(mpt)){
        //     System.out.println("Is a Anagram");
        // }
        // else{
        //     System.out.println("Not a Anagram");
        // }
    }
}
