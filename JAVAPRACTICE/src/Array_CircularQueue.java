public class Array_CircularQueue {

    public static class CircularQueue{

        int n=5;
        int arr[]=new int[n];
        int size=0;
        int f=-1;
        int r=-1;

        // CircularQueue(int s){
        //     this.n=s;
        // }

        boolean IsEmpty(){
            if (size==0){
                return true;
            }
            else{
                return false;
            }
        }

        void add(int val){ //throws Exception{
            if(size==n){
                //throw new Exception("Queue is full !!!");
                System.out.println("Queue is full.");
            }
            if(size==0 && f==-1){
                f=0;
                r=0;
                arr[r]=val;
                size++;
            }
            else if(r==n-1){
                r=0;
                arr[0]=val;
                size++;
            }
            else{
                arr[r+1]=val;
                size++;
                r++;
            }
        }

        int poll() throws Exception{
            if(size==0){

                throw new Exception("Queue is Empty!!!!");
                // System.out.println("Queue is empty.");
                // return -1;
            }
            else if(f==n-1){
                int top=arr[f];
                f=0;
                size--;
                return top;
            }
            else{
                int top=arr[f];
                f++;
                size--;
                return top;
            }
        }

        int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!");
            }
            else {
                return arr[f];
            }
        }

        void display() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!");
            }
            else if (f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(r<f){
                for(int i=f;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int j=0;j<=r;j++){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        
        CircularQueue cq=new CircularQueue();

        System.out.println(cq.IsEmpty());

        cq.add(1);
        System.out.println(cq.IsEmpty());
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);

        cq.display();
        System.out.println(cq.size);
        System.out.println(cq.peek());
        System.out.println(cq.poll());
        System.out.println(cq.poll());

        cq.add(6);
        cq.add(7);
        cq.add(8);
        cq.display();
        System.out.println(cq.size);
        System.out.println(cq.peek());
        System.out.println(cq.poll());
    }
}
