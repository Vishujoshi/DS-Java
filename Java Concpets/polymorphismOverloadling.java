
//compile time polymorphism
//method overloading
class My{

    public void sum(int a){
        int sum = a+a;
        System.out.println(sum);
    }
    public void sum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
}

public class polymorphismOverloadling {
    public static void main(String[] args) {
 My a =new My();
 a.sum(212);
 a.sum(23,45);
    }
}
