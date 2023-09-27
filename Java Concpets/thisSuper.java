class square{
    int length;
    square(int a){
        this.length=a;
    }
    void area(){
        System.out.println(length*length);
    }
}
class rectangle extends square{
    int breadth;
    rectangle(int a,int b){
        super(a);
        this.breadth=b;
    }
    void area(){
        System.out.println(length*breadth);
    }
}



public class thisSuper {
    public static void main(String[] args) {
      rectangle s=new rectangle(2,5);
      square q=new square(10);
      q.area();
      s.area();
    }
}
