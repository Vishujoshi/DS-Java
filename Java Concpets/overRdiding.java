class Super{
    public void display(){
        System.out.println("super class");
    }
}
class sub extends Super{
    public void display(){
        System.out.println("Sub class");
    }
}

public class overRdiding {
    public static void main(String[] args) {

        Super s =new sub();    // Dynamic Method dispatch or Runtime Polymorphism
        s.display();
    }
}
