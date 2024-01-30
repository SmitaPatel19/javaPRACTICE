import java.util.*;

public class HashMap_implementation {

    static class MyHashMap<K,V>{
        public static final int default_capacity=4;
        public static final float deafult_load_factor=0.75f;

        private class Node{
            K key;
            V value;

            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){
            buckets=new LinkedList[N];

            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }

        private int HashFunc(K key){
            int hc=key.hashCode();
            return Math.abs(hc)%buckets.length;
        }

        //traverses the linled list and look for a node with key, if found it returns it's index otherwise return null
        private int searchInBucket(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> []oldBucket=buckets;
            initBuckets(oldBucket.length*2);
            n=0;
            
            for(var bucket: oldBucket){
                for(var node: bucket){
                    put(node.key, node.value);
                }
            }
        }

        public MyHashMap(){
            initBuckets(default_capacity);
        }

        public int size(){
            return n;
        }

        public void put(K key,V value){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];

            int ei=searchInBucket(currBucket,key);
            if(ei==-1){ //not exist
                Node node=new Node(key, value);
                currBucket.add(node);
                n++;
            }
            else{
                Node currNode = currBucket.get(ei);
                currNode.value =value;
            }

            if(n>= buckets.length+ deafult_load_factor){
                rehash();
            }
        }

        public V get(K key){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);
            if(ei==-1){ // not exist
                return null;
            }
            else{
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
        }

        public V remove(K key){

            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket, key);

            if(ei==-1){//key not exist
                return null;
            }
            else{
                Node currNode=currBucket.get(ei);
                V val=currNode.value;
                currBucket.remove(ei);
                return val;
            }
        }
    }
    public static void main(String[] args) {
        
    }    
}
