package BinaryTreePack;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public BinaryTNode root;

    public BinaryTree(){
        this.root=null;
    }

    public void preorderTraversal(BinaryTNode node){
        if (node==null){
            return;
        }
        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);

    }
    public void inorderTraversal(BinaryTNode node){
        if (node==null){
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);

    }
    public void postorderTraversal(BinaryTNode node){
        if (node==null){
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value + " ");

    }
    public  void levelOrderTraversal(BinaryTNode node){

        Queue<BinaryTNode> queue=new LinkedList<BinaryTNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTNode presentNode=queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
        System.out.println();

    }
    public void search(String value) {
//        try{
            Queue<BinaryTNode> queue = new LinkedList<BinaryTNode>();
        BinaryTNode presentNode;
            queue.add(root);
            while (!queue.isEmpty()) {
                 presentNode= queue.remove();
                if (presentNode.value ==value) {

                    System.out.println("Value found");
                    return;
                }
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }

            }

//        }
//        catch (Exception e){
            System.out.println("value not found");
//        }


    }

    public void insert(String value){
        BinaryTNode newnode = new BinaryTNode();
        newnode.value=value;
        if(root==null){
            root=newnode;
            System.out.println("Value inserted at root");
            return;
        }

            Queue<BinaryTNode> queue=new LinkedList<BinaryTNode>();

            queue.add(root);
            while(!queue.isEmpty()){
                BinaryTNode presentNode=queue.remove();
                if(presentNode.left==null){
                    presentNode.left=newnode;
                    System.out.println("Inserted at left");
                    break;
                }
                if(presentNode.right==null){
                    presentNode.right=newnode;
                    System.out.println("Inserted at rightt");
                    break;
                }
                else {
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }




        }

    }

    public BinaryTNode getDeepestNode(){
        Queue<BinaryTNode> queue=new LinkedList<BinaryTNode>();
     queue.add(root);
     BinaryTNode presentNode=null;
     while (!queue.isEmpty()){

         presentNode=queue.remove();
         if(presentNode.left!=null){
                queue.add(presentNode.left);
         }
         if(presentNode.right!=null){
             queue.add(presentNode.right);
         }

     }
     return presentNode;
    }

    public void deleteDeepestNode(){
        Queue<BinaryTNode> queue=new LinkedList<BinaryTNode>();
        queue.add(root);
        BinaryTNode presentNode=root,prevNode=null;
        while (!queue.isEmpty()){
            prevNode=presentNode;
            presentNode=queue.remove();
            if(presentNode.left==null){
                prevNode.right=null;
                return;
            }
            if(presentNode.right==null){
                presentNode.left=null;
                return;
            }

                queue.add(presentNode.left);
                queue.add(presentNode.right);

        }

    }

    void deleteNode(String value) {
        Queue<BinaryTNode> queue = new LinkedList<BinaryTNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTNode presentNode = queue.remove();
            if (presentNode.value == value) {
                presentNode.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("The node is deleted!");
                return;
            } else {
                if (presentNode.left != null) queue.add(presentNode.left);
                if (presentNode.right != null) queue.add(presentNode.right);
            }
        }
        System.out.println("The node does not exist in this BT");
    }


    // Delete Binary Tree
    void deleteBT() {
        root = null;
        System.out.println("BT has been successfully deleted!");
    }

}
