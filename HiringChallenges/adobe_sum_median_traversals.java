import java.io.*;
import java.util.*;
class Node
{
    int val;
    Node left,right;
    Node(int val)
    {
        this.val=val;
    }
}
public class Solution {
    static int c=0;
    static int preorder[]; 
    static int inorder[];
    static int postorder[];
    static void preOrder(Node root)
    {
        if(root!=null)
        {
            preorder[c++]=root.val;
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            inorder[c++]=root.val;
            inOrder(root.right);
        }
    }
    static void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            postorder[c++]=root.val;
        }
    }
    public static void swapNodes(Node parent)
    {
        Node temp=parent.left;
        parent.left=parent.right;
        parent.right=temp;
    }
    public static int median(int a,int b,int c)
    {
        int A[]=new int[3];
        A[0]=a;
        A[1]=b;
        A[2]=c;
        Arrays.sort(A);
        return A[1];
    }
    public static void main(String []args)throws Exception
    {
       Scanner S=new Scanner(System.in);
       int m=S.nextInt();
       int parents[]=new int[m];
       for(int i=0;i<m;i++)
       parents[i]=S.nextInt();
       HashMap<Integer,Node> hm=new HashMap<Integer,Node>();
       Node root = new Node(0);
       hm.put(0,root);
       for(int i=0;i<m;i++)
       {
           int node =i+1;
           int parent=parents[i];
           Node child,par;
           boolean isChildPresent = false;
           if(hm.containsKey(node))
           {
               child = hm.get(node);
            //    System.out.print("Yes ");
           }
           else
           {
               child = new Node(node);
               hm.put(node,child);
            //    System.out.print("No ");
           }
           if(hm.containsKey(parent))
           {
               par = hm.get(parent);
               isChildPresent = true;
            //    System.out.print("Yes ");
           }
           else
           {
               par = new Node(parent);
               hm.put(parent,par);
            //    System.out.print("No ");
           }
           if(isChildPresent)
           {
               if(par.left!=null)
               par.right = child;
               else
               par.left = child;
               if(par.left!=null&&par.right!=null&&par.left.val>par.right.val)
               swapNodes(par);
           }
           else
           {
               par.left = child;
           }
       }
       c=0;
       preorder = new int[m+1];
       inorder = new int[m+1];
       postorder = new int[m+1];
       preOrder(root);
       c=0;
       inOrder(root);
       c=0;
       postOrder(root);
       long ans=0;
       for(int i=0;i<preorder.length;i++)
       {
           ans+=median(preorder[i],inorder[i],postorder[i]);
       }
       System.out.println(ans);
    }

}
