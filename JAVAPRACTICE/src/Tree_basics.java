import java.util.*;
public class Tree_basics {

    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int val){
            this.data=val;
            this.right=null;
            this.left=null;
        }
    }

    public static class TreeInfo{
        int ht;
        int dim;

        TreeInfo(int height,int diameter){
            this.ht=height;
            this.dim=diameter;
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
                System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);

        }

        void Inorder(Node root){
            if(root==null){
                System.out.print("-1"+" ");
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);

        }

        void Postorder(Node root){
            // if(root.left==null && root.right==null){
            //     System.out.print("-1 -1"+" ");
            //     System.out.print(root.data+" ");
            //     return;
            // }
            // if(root.left==null && root.right!=null){
            //     System.out.print("-1"+" ");
            //     Postorder(root.right);
            //     System.out.print(root.data+" ");
            //     return;
            // }
            // Postorder(root.left);
            // Postorder(root.right);
            // System.out.print(root.data+" ");

            if(root==null){
                System.out.print("-1"+" ");
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }

        void Levelorder(Node root){
            if(root==null){
                System.out.println("Tree is Empty.");
                return;
            }
            Queue<Node> qu=new LinkedList<>();
            qu.add(root);
            qu.add(null);
            
            while(qu.isEmpty()!=true){
                Node curr=qu.poll();
                if(curr==null){
                    System.out.println();
                    if(qu.isEmpty()==true){
                        break;
                    }
                    else{
                        qu.add(null);
                    }
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        qu.add(curr.left);
                    }
                    if(curr.right!=null){
                        qu.add(curr.right);
                    }
                }
            }
        }

        int countNodes(Node root){
            // int x=0;
            // int y=0;
            // if(root.left==null & root.right==null){
            //     return 1;
            // }
            // if(root.left!=null){
            //     x=countNodes(root.left);
            // }
            // if(root.right!=null){
            //     y=countNodes(root.right);
            // }
            // int tot=x+y+1;
            // return tot;

            if(root==null){
                return 0;
            }
            int x=countNodes(root.left);
            int y=countNodes(root.right);
            int tot=x+y+1;
            return tot;
        }

        int SumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int x=SumOfNodes(root.left);
            int y=SumOfNodes(root.right);
            int sum=x+y+root.data;
            return sum;
        }

        int Height(Node root){

            //Time complexity=O(n)
            if(root==null){
                return 0;
            }
            int x=Height(root.left);
            int y=Height(root.right);
            int tot=Math.max(x,y)+1;
            return tot;
        }

        int Diameter(Node root){
            //timme complexity = O(n^2).
            if(root==null){
                return 0;
            }
            int diam1=Diameter(root.left);
            int diam2=Diameter(root.right);
            int diam3=Height(root.left)+Height(root.right)+1;
            int res=Math.max(diam1,Math.max(diam2,diam3));
            return res;
        }

        TreeInfo Diameter2(Node root){
            //Time complexity=O(n);
            if(root==null){
                return new TreeInfo(0,0);
            }
            TreeInfo left=Diameter2(root.left);
            TreeInfo right=Diameter2(root.right);

            int height=Math.max(left.ht,right.ht)+1;

            int diam1=left.dim;
            int diam2=right.dim;
            int diam3=left.ht+right.ht+1;

            int resdiam=Math.max(diam1,Math.max(diam2, diam3));
            TreeInfo res=new TreeInfo(height, resdiam);

            return res;
        }
    }    
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(arr);

        System.out.println("     "+root.data);
        System.out.print("  "+root.left.data+"     ");
        System.out.println(root.right.data);
        System.out.print(" "+root.left.left.data+"  ");
        System.out.print(root.left.right.data+"    ");
        //System.out.print(root.right.left.data+" ");
        System.out.println(root.right.right.data);

        tree.Preorder(root);
        System.out.println();

        tree.Inorder(root);
        System.out.println();

        tree.Postorder(root);
        System.out.println();

        tree.Levelorder(root);
        System.out.println();

        System.out.println("Number of nodes : "+tree.countNodes(root));
        System.out.println("Sum of Nodes : "+tree.SumOfNodes(root));
        System.out.println("Height : "+tree.Height(root));
        System.out.println("Diameter : "+tree.Diameter(root));
        System.out.println("Diameter : "+tree.Diameter2(root).dim);

    }    
}