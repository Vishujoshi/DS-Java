package StackPack;

public class LinklistStack {
    singleLL s;

    public LinklistStack(){
        s=new singleLL();
        System.out.println("Stack LL is Created");
    }
    public boolean isEmpty(){
        if(s.head==null){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int value){
        s.prepend(value);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        else {
            int top= s.head.data;
            s.removeFirst();
            return top;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");

        }
        else {
            int top= s.head.data;
            System.out.println(top);
        }
    }
    public void delete(){
        s.deleteLL();
    }

    public void showLLstack(){
        System.out.print("stack ");
        s.printList();

    }
}
