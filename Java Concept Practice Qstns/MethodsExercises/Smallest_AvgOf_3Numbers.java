//1. Write a Java method to find the smallest number among three numbers.
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:
//
//The smallest value is 25.0
//2. Write a Java method to compute the average of three numbers.
//Test Data:
//Input the first number: 25
//Input the second number: 45
//Input the third number: 65
//Expected Output:
//
//The average value is 45.0
class ex1{
    public void smallest(int a,int b ,int c){
        if(a<b&&a<c)
        {
            System.out.println(a + " is smallest");
        }
        else if (b<a&&b<c){
            System.out.println(b + " is smallest");
        }
        else {
            System.out.println(c + " is smallest");
        }

    }
    public void avg(int a,int b,int c){
        float average = (float) (a + b + c) /3;
        System.out.println("Average of" + " " + a + " " + b + " " + c + " = " +average);
    }
}

public class Smallest_AvgOf_3Numbers {
    public static void main(String[] args) {
        ex1 a =new ex1();
        a.smallest(1,3,12);
        a.avg(2,3,53);
    }
}
