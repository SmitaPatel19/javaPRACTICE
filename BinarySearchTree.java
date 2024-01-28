import java.util.*;

public class BinarySearchTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }

    public static class BST{

        Node insert(Node root,int val){
            if(root==null){
                Node temp=new Node(val);
                root=temp;
                return root;
            }

            if(val>root.data){
                root.right=insert(root.right, val);
            }
            else{
                root.left=insert(root.left,val);
            }
            return root;
        }

        void InorderDisplay(Node root){
            if(root==null){
                return;
            }
            InorderDisplay(root.left);
            System.out.print(root.data+" ");
            InorderDisplay(root.right);
        }

        boolean search(Node root,int val){
            if(root==null){
                return false;
            }
            if(root.data==val){
                return true;
            }
            else if(root.data>val){
                return search(root.left, val);
            }
            else{
                return search(root.right, val);
            }
        }

        Node delete(Node root,int val){

            if(root.data>val){
                root.left=delete(root.left, val);
            }
            else if(root.data<val){
                root.right=delete(root.right, val);
            }
            else{
                if(root.left==null & root.right==null){
                    root=null;
                }
                else if(root.left==null){
                    root=root.right;
                }
                else if(root.right==null){
                    root=root.left;
                }
                else{

                    Node in=inordersuccessor(root.right);
                    root.data=in.data;
                    root.right=delete(root.right, in.data);
                }
            }
            return root;
        }

        Node inordersuccessor(Node root){
            while(root!=null){
                root=root.left;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        
        int arr[]={8,5,3,1,4,6,10,11,14};

        BST bst=new BST();

        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=bst.insert(root,arr[i]);
        }

        bst.InorderDisplay(root);
        System.out.println();

        System.out.println(bst.search(root, 8));
        System.out.println(bst.search(root, 23));

        bst.delete(root, 10);
        bst.InorderDisplay(root);
        System.out.println();
    }
}
