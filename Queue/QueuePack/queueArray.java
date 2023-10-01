package QueuePack;

public class queueArray {

    public int[] arr;
    public int top=-1;
    public int start=0;
    public queueArray(int size){
        this.arr=new int[size];
        System.out.println("Queue is created with size " + size);
    }

    public boolean isFull(){
        if(top== arr.length-1){
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int value){
        if(!isFull()){
            arr[top+1]=value;
            System.out.println("Value added at index "  + (top+1));
            top++;
        }
        else {
            System.out.println("Stack is full");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
           if(start>top){
               System.out.println("All elements Dequeued");
               return -1;
           }
           else{
               int value= arr[start];
               arr[start]=Integer.MIN_VALUE;

               start++;

               return value;
           }

        }

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else {


            return arr[start];
        }
    }

}
