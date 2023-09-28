package arrays;

public class TwoDArraHelp {
    int [][]arr;
    public void create2dArray(int row ,int column){
        this.arr=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]=Integer.MIN_VALUE;
            }

        }
        System.out.println("2D array is created with row " + row + " & column " + column);

    }

    public void insert(int row,int column,int value){
try{
    if(arr[row][column]!=Integer.MIN_VALUE){
        System.out.println("Already element Present at location");
    }
    else{
        arr[row][column]=value;
        System.out.println("Value Inserted");
    }
}
catch (Exception e){
    System.out.println(e);
}


    }


    public void accessElement(int row,int column){
        try{
            System.out.println(arr[row][column] );
        }
        catch (Exception e){
            System.out.println("Arrays Out of bounds");
        }

    }
    public void traversal() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        } catch (Exception e) {
            System.out.println(e + "  Array doesn't exist  ");
        }
    }

    public void deleteElement(int row , int column){
        try{
            if(arr[row][column]==Integer.MIN_VALUE){
                System.out.println("No element present");
            }
            else{

                arr[row][column]= Integer.MIN_VALUE;
                System.out.println("Element deleted");
            }
        }
       catch (Exception e){
           System.out.println(e);
       }

    }
    public void search(int value){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==value){
                    System.out.println("Value found at Index " + i + "" + j );
                    return;
                }
            }


        }
        System.out.println("value Not Found");


    }

    public void deleteArray(){
        this.arr=null;
        System.out.println("Array deleted");
    }



}
