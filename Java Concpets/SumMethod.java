//Method and Method overloading in java
class sumfun{
    int a=1,b=2;
    int sum=a+b;
    void sum(int b){
        sum=b+b;
        System.out.println(sum);
    }
    void sum(int b,int a){
        sum=a+b;
        System.out.println(sum);
    }
    void sum(float b,float a){
        float sum=a+b;
        System.out.println(sum);
    }
    int sum(){
        return a+b;
    }
}


public class SumMethod {



    public static void main(String[] args) {

       sumfun s=new sumfun();
s.sum(1);
        s.sum(2,4);
        s.sum(3f,6f);

        System.out.println(s.sum());
        System.out.println("Sum of nos. = " + s.sum);
    }
}
