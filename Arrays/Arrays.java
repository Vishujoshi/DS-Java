import arrays.arrayhelp;

public class Arrays {
    public static void main(String[] args) {

        arrayhelp s=new arrayhelp();
        s.createArray(6);
        s.insert(5,12);
        s.accessElement(4);
//        s.traversal();
//        s.deleteElement(5);
//        s.deleteArray();
//        s.traversal();
        s.search(12);
    }

}
