import QueuePack.LLqueue;

public class LLQueueMain {
    public static void main(String[] args) {
        LLqueue s=new LLqueue();
        s.enQueue(1);
        s.enQueue(2);
        s.enQueue(3);
        System.out.println(s.peek());;
        s.deQueue();
        System.out.println(s.peek());;
    }
}
