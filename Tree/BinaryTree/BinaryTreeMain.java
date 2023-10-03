import BinaryTreePack.BinaryTree;

public class BinaryTreeMain {
    public static void main(String[] args) {
     BinaryTree a =new BinaryTree();
     a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.insert(6);
     a.preorderTraversal();
        System.out.println();
     a.inorderTraversal();
        System.out.println();
     a.postorderTraversal();
        System.out.println();
     a.levelorderTraversal();
     a.search(8);
        System.out.println(a.getDeepestNode().value);;
        a.deleteDeepestNode();
        System.out.println(a.getDeepestNode().value);;
    }
}
