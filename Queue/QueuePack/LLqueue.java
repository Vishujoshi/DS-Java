package QueuePack;

public class LLqueue {
    singleLL s;

    public LLqueue(){
        s=new singleLL();
        System.out.println("LL queue is created");
    }
    public boolean iseEmpty(){
        if(s.head==null){
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int value){
        s.append(value);
    }
    public void deQueue(){
        s.removeFirst();
    }
    public int peek(){
        return s.head.data;
    }

    public void deleteQueue(){
        s.deleteLL();
    }
}
