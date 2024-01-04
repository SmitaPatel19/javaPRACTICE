import java.util.*;


public class BinarySerchTree_Inmpl {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
        }
    }

    public static class BST{


        Node BuildBST(Node root,int val){
            if(root==null){
                Node temp=new Node(val);
                root=temp;
                return root;
            }
            if(val>root.data){
                root.right=BuildBST(root.right,val);
                
            }
            else{
                root.left=BuildBST(root.left,val);
            }
            return root;
        }

        void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }

        boolean Search(Node root,int val){
            if(root==null){
                return false;
            }
            if(root.data>val){
                return Search(root.left, val);
            }
            else if (root.data==val){
                return true;
            }
            else{
                return Search(root.right, val);
            }
        }

        Node DeleteNode(Node root,int val){
            if(root.data>val){
                root.left=DeleteNode(root.left, val);    //Search
            }
            else if(root.data<val){
                root.right=DeleteNode(root.right, val);
            }
            else{
                if(root.left==null && root.right==null){
                    root=null;
                }
                else if(root.left==null){
                    root=root.right;
                }
                else if(root.right==null){
                    root=root.left;
                }
                else{
                    Node IS=InorderSuccessor(root.right);
                    root.data=IS.data;
                    root.right=DeleteNode(root.right, IS.data);  //root ke right me IS ka data delete krke return krega.
                }
                
            }
            return root;
        }

        Node InorderSuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }

        void PrintInRange(Node root,int x,int y){

            if(root==null){
                return;
            }
            if(root.data>=x && root.data<=y){
                PrintInRange(root.left,x,y);
                System.out.print(root.data+" ");
                PrintInRange(root.right, x, y);
            }
            else if(root.data>=y){

                PrintInRange(root.left, x, y);
            }
            else {//if(root.data<=y){
                PrintInRange(root.right, x, y);
            }
        }

        void PrintRootToLeaf(Node root,ArrayList<Integer> arr){

            if(root==null){
                return;
            }
            arr.add(root.data);

            if(root.left==null && root.right==null){
                PrintPath(arr);
            }
            else{
                PrintRootToLeaf(root.left, arr);
                PrintRootToLeaf(root.right, arr);
            }
            arr.remove(arr.size()-1);
        }

        void PrintPath(ArrayList<Integer> arr){
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner scn=new Scanner (System.in);

        int arr[]={8,5,3,1,4,6,10,11,14};

        BST tree=new BST();
        
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=tree.BuildBST(root, arr[i]);
        }
        tree.Inorder(root);
        System.out.println();

        //Search
        System.out.print("Number to search : ");
        int n=scn.nextInt();
        boolean key=tree.Search(root, n);
        if(key==true){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }

        //Delete
        // System.out.print("Enter number to delete : ");
        // int x=scn.nextInt();
        // tree.DeleteNode(root, x);
        // tree.Inorder(root);
        // System.out.println();

        tree.PrintInRange(root, 1, 3);
        System.out.println();

        tree.PrintRootToLeaf(root, new ArrayList<>());
    }
}
