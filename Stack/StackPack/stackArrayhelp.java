package StackPack;

public class stackArrayhelp {
    public int []arr;
    public int top=0;
     public stackArrayhelp(int size){
         this.arr=new int[size];
         System.out.println("Stack of Size " + size + " is created");
     }

     public boolean isFull(){
         if(top== arr.length){
             return true;
         }
         else
         {
             return false;
         }
     }

     public boolean isEmpty(){
         if(top==0){
             return true;
         }
         else {
             return false;
         }
     }

     public void push(int value){
         if(!isFull()){
             arr[top]=value;
             System.out.println("Value added at index "  + top);
             top++;
         }
         else {
             System.out.println("Stack is full");
         }
     }

     public int pop(){
         if(isEmpty()){
             System.out.println("Stack is Empty");
             return -1;
         }
         else {

             int value= arr[--top];
             arr[top]=Integer.MIN_VALUE;
             return value;
         }

     }

    public void peek(){
        if (isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            System.out.println(arr[top-1]);
        }
    }

    public void deletestack(){
        arr=null;
        System.out.println("Stack is Deleted");
    }
}


