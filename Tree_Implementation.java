import java.util.*;
public class Tree_Implementation {

    public static class Node{
        int  data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree{

        int idx=-1;

        Node BuildTree(int arr[]){
            
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            Node root=new Node(arr[idx]);
            root.left=BuildTree(arr);
            root.right=BuildTree(arr);
            return root;

        }

        void Preorder(Node root){
            if(root==null){
                //System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }

        void Postorder(Node root){
            if(root==null){
                //System.out.print("-1"+" ");
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }

        void Inorder(Node root){
            if(root==null){
                //System.out.print("-1"+" ");
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("No. of Nodes : ");
        int n=scn.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter nodes : ");
        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(arr);
        System.out.println("root : "+root.data);

        System.out.print("Preorder : ");
        tree.Preorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        tree.Postorder(root);
        System.out.println();

        System.out.print("Inorder : ");
        tree.Inorder(root);
        System.out.println();
    }
}
