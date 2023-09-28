import arrays.TwoDArraHelp;

public class TwoDArray {
    public static void main(String[] args) {
        TwoDArraHelp a=new TwoDArraHelp();
        a.create2dArray(2,3);
        a.insert(1,2,45);
        a.accessElement(1,2);
       a.traversal();
//        a.deleteElement(1,2);
        a.search(45);
    }
}
