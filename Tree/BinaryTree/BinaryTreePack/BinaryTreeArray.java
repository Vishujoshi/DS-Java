package BinaryTreePack;

public class BinaryTreeArray {
   public int[] arr;
    int lastUsedIndex;

    public BinaryTreeArray(int size){
        this.arr=new int[size+1];
        this.lastUsedIndex=0;
        System.out.println("BT of size " + size + " is created");

    }
    public boolean isFull(){
        if(lastUsedIndex+1==arr.length){
            return true;
        }
        else {
            return false;
        }
    }

    public void insert(int value){
        if(isFull()){
            System.out.println("BT array is Full");
        }
        else {
            arr[lastUsedIndex+1]=value;
            lastUsedIndex++;
            System.out.println("Value Inserted at index " + lastUsedIndex);
        }

    }

    public void preorderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }else{
            System.out.print(arr[index] + " " );
            preorderTraversal(index*2);
            preorderTraversal((index*2)+1);
        }
    }

    public void inorderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }else{

            inorderTraversal(index*2);
            System.out.print(arr[index] + " " );
            inorderTraversal((index*2)+1);
        }
    }
    public void postorderTraversal(int index){
        if(index>lastUsedIndex){
            return;
        }else{

            postorderTraversal(index*2);
            postorderTraversal((index*2)+1);
            System.out.print(arr[index] + " " );

        }
    }

    public void levelOrderTraversal(){
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public int search(int value){

        for(int i=1;i< lastUsedIndex;i++){
            if(arr[i] == value){
                System.out.println("value is Found at Index " + i);
                return i;
            }

        }
        System.out.println("value not found");
        return -1;
    }

    public void delete(int value){
        int loc=search(value);
        if(loc==-1)
        {
            return;
        }
        else{
            arr[loc]=arr[lastUsedIndex];
            lastUsedIndex--;
        }

    }

    public  void deleteEntire(){
        arr=null;
        System.out.println("Successfully deleted");
    }
}
