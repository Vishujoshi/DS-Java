import QueuePack.circularQueueArray;

import java.util.Arrays;

public class CircularQueueArrayMain {
    public static void main(String[] args) {
        circularQueueArray s=new circularQueueArray(4);
        System.out.println(s.isEmpty());
        s.enQueue(1);
        s.enQueue(2);s.enQueue(3);s.enQueue(4);
        System.out.println(Arrays.toString(s.arr));
        System.out.println(s.arr.length);
        System.out.println(s.deQueue());
        System.out.println(Arrays.toString(s.arr));
        s.enQueue(5);
        System.out.println(s.deQueue());
//        s.deQueue();
        System.out.println(s.isEmpty());System.out.println(s.isFull());
//s.enQueue(7);
//s.enQueue(8);
//s.enQueue(9);
        System.out.println(Arrays.toString(s.arr));
        s.peek();


    }
}
