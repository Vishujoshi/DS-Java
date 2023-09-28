package arrays;

import javax.swing.*;
import java.sql.SQLOutput;

public class arrayhelp {
    int []arr;

    public void createArray(int size){
        this.arr =new int[size];
        System.out.println("Arrays of size " + size + " is created");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.MIN_VALUE;

        }
    }

    public void insert(int index,int value){
        if(index>arr.length){
            System.out.println("Array index greater than size of array");
        }
        else if(arr[index]!=Integer.MIN_VALUE){
            System.out.println("Already element Present at location");
        }
        else{
            arr[index]=value;
            System.out.println("Value Inserted");
        }
    }

    public void accessElement(int index){
        if(index>arr.length){
            System.out.println("Array index greater than size of array");
        }
        else{

            System.out.println(arr[index]);
        }

    }
    public void traversal(){
        try{
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +  " ");

            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e + "  Array doesn't exist  ");
        }


    }

    public void deleteElement(int index){
        if(index>arr.length){
            System.out.println("Array index greater than size of array");
        }
        else if(arr[index]==Integer.MIN_VALUE){
            System.out.println("No element present");
        }
        else{

            arr[index]= Integer.MIN_VALUE;
            System.out.println("Element deleted");
        }

    }
    public void search(int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                System.out.println("Value found at Index " + i );
             return;
            }

        }
        System.out.println("value Not Found");


    }

    public void deleteArray(){
        this.arr=null;
        System.out.println("Array deleted");
    }

}
