import java.util.*;
public class HashMap_frequency {
    
    public static void main(String[] args) {
        int arr[]={1,3,2,1,4,1,2,4,2,4,2,4,2,4,4};

        Map<Integer,Integer> map=new HashMap<>();

        for(int elem: arr){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem)+1);
            }
            else{
                map.put(elem,1);
            }
        }

        System.out.print("Frequency is : ");
        System.out.println(map.entrySet());

        int maxfreq=-1;
        int keyElem=-1;
        for(var e: map.entrySet()){
            if(e.getValue()>maxfreq){
                maxfreq=e.getValue();
                keyElem=e.getKey();
            }
        }

        System.out.println("Maximum frequency element : "+ keyElem+" with frequency : "+maxfreq);
    }
}
