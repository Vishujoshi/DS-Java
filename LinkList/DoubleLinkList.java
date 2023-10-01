import LLpack.doubleLL;

public class DoubleLinkList {
    public static void main(String[] args) {
   doubleLL a=new doubleLL();
   a.createDoubleLL(1);
   a.createDoubleLL(2);
   a.createDoubleLL(3);
   a.prepend(0);
   a.append(22);
   a.insert(2,34);

   a.printList();
//   a.removeLast();
//        a.printList();
        a.reverse();
//   a.search(2);
        try{
            System.out.println("head = " + a.head.data);
            System.out.println("Tail "  + a.tail.data);
            System.out.println("head next= " + a.head.next.data);
//            System.out.println("Tail next= "  + a.tail.next.data);
//            System.out.println("head prev= " + a.head.prev.data);
            System.out.println("Tail prev= "  + a.tail.prev.data);
        }
        catch (Exception e){
            System.out.println(e + "  null values");
        }

    }
}
