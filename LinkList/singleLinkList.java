import LLpack.singleLL;

public class singleLinkList {
    public static void main(String[] args) {
        singleLL s =new singleLL();
        s.createSingleLL(10);
        s.createSingleLL(20);
        s.createSingleLL(30);
//        System.out.println(s.head.data);
//        System.out.println(s.tail.data);
        s.printList();
//        s.search(30);
        s.append(1);
//        s.insert(5,2);
        s.printList();
//        s.removeFirst();
//        s.removeLast();
        s.delete(4);
        s.printList();
//               System.out.println("head = " + s.head.data);
//       System.out.println("Tail "  + s.tail.data);
        s.reverse();
    }
}
