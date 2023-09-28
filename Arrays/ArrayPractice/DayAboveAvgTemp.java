import java.util.Arrays;
import java.util.Scanner;
class temperature{
     public int[] arr;
   int top=0;
   void createArray(int size){
        this.arr=new int[size];

    }
   void insert(int val){

       arr[top]=val;
       top++;

   }
   int avg(){
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];

       }
       int avg=sum/arr.length;
//       System.out.println(avg);
       return avg;
   }

   void daysAboveAvgTemp(int avg){
       int c=0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]>avg){
               c++;
           }

       }
       System.out.println( c + " days temp above average temperature");

   }

}

public class DayAboveAvgTemp {



    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("How many days temperature");
        int days=s.nextInt();
        temperature a=new temperature();
        a.createArray(days);
        for (int i = 0; i < days; i++) {
            System.out.println("Enter day " +  (i+1)  + " temperature");
            int t=s.nextInt();
            a.insert(t);

        }
        System.out.println("Average of " + days + " days temps = " + a.avg());
        int avg = a.avg();
         a.daysAboveAvgTemp(avg);
        System.out.println(Arrays.toString(a.arr));
    }
}
