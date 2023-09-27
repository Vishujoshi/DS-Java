
abstract class shape{
    abstract public void area();
    abstract public void perimeter();

    void display(){
        System.out.println("abstract display");
    }
}

class circle extends shape{
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
class rectangle1 extends shape{
    int length,breadth;
    public void area(){

        System.out.println("area of reactangle = " + length*breadth);
    }

    public void perimeter(){

        System.out.println("area of reactangle = " + 2*(length+breadth));
    }
}

public class Abstractclass {
    public static void main(String[] args) {
        rectangle1 r =new rectangle1();
        r.length=2;
        r.breadth=3;
        r.area();
        r.perimeter();
        circle a= new circle();
        a.radius=5;
        a.area();
        a.perimeter();
        a.display();

    }
}
