interface shape1{
    void area();
   void perimeter();




}

class circle1 implements shape1{
    int radius;

    public void area(){

        System.out.println("area of circle = " + radius*radius);
    }

    public void perimeter(){

        System.out.println("Perimeter of circle = " + (2*3.14 *radius));
    }
    void display(){
        System.out.println("area display");
    }
}
class rectangle11 extends shape{
    int length,breadth;
    public void area(){

        System.out.println("area of reactangle = " + length*breadth);
    }

    public void perimeter(){

        System.out.println("area of reactangle = " + 2*(length+breadth));
    }
}

public class Interface {
    public static void main(String[] args) {
  rectangle11 r=new rectangle11();
  r.area();
  r.display();
    }
}
