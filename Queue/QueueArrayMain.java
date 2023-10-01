import QueuePack.queueArray;

import java.util.Arrays;

public class QueueArrayMain {
    public static void main(String[] args) {
     queueArray s= new queueArray(3);
    s.enQueue(1);
    s.enQueue(2);
    s.enQueue(3);

        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        System.out.println(s.deQueue());;
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println(s.deQueue());
        System.out.println(Arrays.toString(s.arr));
    }
}
