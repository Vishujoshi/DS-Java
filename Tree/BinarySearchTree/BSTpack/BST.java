package BSTpack;



import java.util.LinkedList;
import java.util.Queue;

public class BST {
   public binaryNode root;
    public BST(){
        this.root=null;
        System.out.println("BST is created");
    }

    private binaryNode insert(binaryNode cuurent,int value){
        binaryNode newnode=new binaryNode();
        newnode.value=value;
        newnode.left=null;
        newnode.right=null;


        if(cuurent==null){
            if(root==null){
                root=newnode;
                System.out.println("value added at BST root");
            }else{
                cuurent=newnode;
            }

        }
        else {
            if(value<cuurent.value){
                cuurent.left= insert(cuurent.left,value);
                System.out.println("value added to left child");

            }
            if(value>cuurent.value){
                cuurent.right= insert(cuurent.right,value);
                System.out.println("value added to right child");

            }
        }

        return cuurent;

    }

    public void insert(int value){
        insert(root,value);
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

    public void search(int value) {
        Queue<binaryNode> queue = new LinkedList<binaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            binaryNode present = queue.remove();
            if (present.value == value) {
                System.out.println("value found");
                return;
            }
            if (present.left != null) {
                queue.add(present.left);
            }
            if (present.right != null) {
                queue.add(present.right);
            }

        }
        System.out.println("Value not found");
    }

public binaryNode minNode(binaryNode root){
        if(root.left==null){
            return root;
        }
        else {
            return minNode(root.left);
        }

}

public binaryNode deleteNode(binaryNode root,int value){
        if(root==null){
            System.out.println("value not found in BST");
            return null;
        }
        if (value<root.value) {
            root.left=deleteNode(root.left,value);

        } else if (value>root.value) {
            root.right=deleteNode(root.right,value);
        }
        else {
            if(root.left!=null && root.right!=null){

                binaryNode minforright=minNode(root.right);
                root.value= minforright.value;
                root.right=deleteNode(root.right, minforright.value);
            }
            else if (root.left!=null){
                root=root.left;
            }
            else if (root.right!=null){
                root=root.right;
            }
            else {
                root=null;
            }
        }
        return root;
}


}
