import StackPack.stackArrayhelp;

import java.util.Arrays;

public class StackArrayMain {
    public static void main(String[] args) {
        stackArrayhelp s =new stackArrayhelp(4);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);

        System.out.println(s.isEmpty());;
        System.out.println(s.isFull());
        System.out.println("tp  = "  + s.top);
        s.pop();
        System.out.println("tp  = "  + s.top);
        s.peek();
        System.out.println("tp  = "  + s.top);
        s.deletestack();
        System.out.println(Arrays.toString(s.arr));
    }
}
