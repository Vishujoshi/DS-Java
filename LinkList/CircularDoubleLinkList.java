import LLpack.CircularDoubleLL;

public class CircularDoubleLinkList {
    public static void main(String[] args) {
        CircularDoubleLL a =new CircularDoubleLL();
a.createCircularDoubleLL(1);
        a.createCircularDoubleLL(2);
        a.createCircularDoubleLL(3);
        a.append(0);
        a.prepend(10);
        a.insert(1,23);
//        a.printList();
//        a.delete(2);
        a.printList();
        a.reverse();
//       a.search(2);







        try{
            System.out.println("head = " + a.head.data);
            System.out.println("Tail "  + a.tail.data);
            System.out.println("head next= " + a.head.next.data);
            System.out.println("Tail next= "  + a.tail.next.data);
            System.out.println("head prev= " + a.head.prev.data);
            System.out.println("Tail prev= "  + a.tail.prev.data);
        }
        catch (Exception e){
            System.out.println(e + "  null values");
        }
    }
}
