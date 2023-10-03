import BSTpack.BST;

public class BSTmain {
    public static void main(String[] args) {
        BST s =new BST();
        s.insert(8);
        s.insert(3);
        s.insert(10);
        s.insert(1);
        s.insert(6);
        s.insert(14);
        s.insert(4);
        s.insert(7);
        s.insert(13);
        s.levelorderTraversal();
        s.deleteNode(s.root,8);
        System.out.println();
        s.levelorderTraversal();



    }
}
