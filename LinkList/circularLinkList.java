import LLpack.circularLL;

public class circularLinkList {
    public static void main(String[] args) {
        circularLL a=new circularLL();
        a.createCircularSingleLL(0);
        a.createCircularSingleLL(2);
        a.createCircularSingleLL(3);

        a.insert(1,1);
        a.printList();
//        a.append(12);
        a.removeLast();
//        a.removeLast();
        a.printList();
        a.reverse();
        System.out.println("head = " + a.head.data);
      System.out.println("Tail "  + a.tail.data);
        System.out.println("head next= " + a.head.next.data);
        System.out.println("Tail next= "  + a.tail.next.data);
//        System.out.println("head = " + a.head.data);
//        System.out.println("Tail "  + a.tail.data);
    }
}
