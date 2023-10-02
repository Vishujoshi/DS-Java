import BinaryTreePack.BinaryTreeArray;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray a =new BinaryTreeArray(6);
        System.out.println(a.isFull());
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        a.insert(5);
        a.insert(6);
        System.out.println(a.isFull());
        a.insert(6);
        System.out.println(a.arr.length);
        a.preorderTraversal(1);
        a.levelOrderTraversal();
    }
}
