package BinaryTreePack;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public binaryNode root;
    public BinaryTree(){
        this.root=null;
        System.out.println("Binary Tree LL is created");
    }
    public void insert(int value) {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        binaryNode newnode = new binaryNode();
        newnode.value = value;
        if (root == null) {
            root = newnode;
            System.out.println("value at root");
        } else {
            while (!queue.isEmpty()) {
                binaryNode present = queue.remove();

                if (present.left == null) {
                    present.left=newnode;
                    System.out.println("Value added at left child");
                    return;
                }
                if (present.right == null) {
                    present.right=newnode;
                    System.out.println("Value added at right child");
                    return;
                }
                queue.add(present.left);
                queue.add(present.right);
            }

        }


    }
    public void traversal(binaryNode node,int ch){
        if(node==null){
            return;
        }else{
            if(ch==1){
                System.out.print(node.value+ " ");
                traversal(node.left,1);
                traversal(node.right,1);
            }
            else if(ch==2){
                traversal(node.left,2);
                System.out.print(node.value+ " ");

                traversal(node.right,2);
            }
            else{
                traversal(node.left,3);


                traversal(node.right,3);
                System.out.print(node.value+ " ");

            }
        }


    }

    public void preorderTraversal(){
        System.out.println("Preorder traversal");
        traversal(root,1);
        System.out.println();
    }
    public void inorderTraversal(){
        System.out.println("Inorder traversal");
        traversal(root,2);
        System.out.println();
    }
    public void postorderTraversal(){
        System.out.println("Postorder traversal");
        traversal(root,3);
        System.out.println();
    }

    public void preorderTraversal(binaryNode node){

        if(node==null){
            return;
        }
        System.out.print(node.value+ " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public void inorderTraversal(binaryNode node){
        if(node==null){
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.value+ " ");
        inorderTraversal(node.right);
    }
    public void postorderTraversal(binaryNode node){
        if(node==null){
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public void levelorderTraversal(){
        if(root==null){
            System.out.println("BT is empty");
        }
        else{
            Queue<binaryNode> queue =new LinkedList<binaryNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                binaryNode present=queue.remove();
                System.out.print (present.value + " " );
                if(present.left!=null){
                    queue.add(present.left);
                }
                if(present.right!=null){
                    queue.add(present.right);
                }

            }
        }

    }

    public void search(int value){
        Queue<binaryNode> queue =new LinkedList<binaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            binaryNode present=queue.remove();
            if(present.value==value){
                System.out.println("value found");
                return;
            }
            if(present.left!=null){
                queue.add(present.left);
            }
            if(present.right!=null){
                queue.add(present.right);
            }

        }
        System.out.println("value not found");
    }

    public binaryNode getDeepestNode(){
        Queue<binaryNode> queue =new LinkedList<binaryNode>();
        binaryNode present = null;
        queue.add(root);
        while (!queue.isEmpty()){
            present=queue.remove();
            if(present.left!=null){
                queue.add(present.left);
            }

            if(present.right!=null){
                queue.add(present.right);
            }

        }
        return present;
    }


    public void deleteDeepestNode(){
        Queue<binaryNode> queue=new LinkedList<binaryNode>();
        queue.add(root);
        binaryNode presentNode=root,prevNode=null;
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

    public void deleteNode(int value){
        Queue<binaryNode> queue=new LinkedList<binaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            binaryNode present = queue.remove();
            if(present.value==value){
                present.value= getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("value deleted");
                return;
            }
            else{
                if(present.left!=null){
                    queue.add(present.left);
                }

                if(present.right!=null){
                    queue.add(present.right);
                }
            }
        }
        System.out.println("value not found");
    }

    public void deleteBT() {
        this.root = null;
        System.out.println("BT has been successfully deleted!");
    }

}
