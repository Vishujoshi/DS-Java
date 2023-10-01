import StackPack.LinklistStack;

public class StackLL {
    public static void main(String[] args) {
        LinklistStack s=new LinklistStack();
       s.push(1);
       s.push(2);
       s.push(3);
s.showLLstack();
        System.out.println(s.pop());
        s.showLLstack();
        s.peek();
        s.delete();
        s.showLLstack();

    }
}
