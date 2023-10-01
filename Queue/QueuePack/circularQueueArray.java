package QueuePack;

public class circularQueueArray {
    public int[] arr;
    int top=-1;
    int beg=-1;

    public circularQueueArray(int size){
        this.arr=new int[size];
        System.out.println("Circular Queue Array is created with size " + size);
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        if(top+1 == beg){
            return true;
        }
        else if(beg==0 && top==arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            beg=0;
            top++;
            arr[top]=value;
            System.out.println("Value added");
        }
        else{
            if(top==arr.length-1){
                top=0;
            }
            else{
                top++;

            }
            arr[top]=value;
            System.out.println("Value added");
        }
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            int result=arr[beg];
            arr[beg]=Integer.MIN_VALUE;
            if (beg==top){
                beg=top=-1;
            } else if (beg==arr.length-1) {
                beg=0;
            }
            else {
                beg++;
            }
    return result;
        }



    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");

        } else {
            int result = arr[beg];


            System.out.println(result);
        }

    }



    public void Delete () {
        arr = null;
        System.out.println("queue deleted");
    }
}
