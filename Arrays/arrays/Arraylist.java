import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        //Creation of arrayList
//        ArrayList<String> l=new ArrayList<>(Arrays.asList("visha","john","aman"));
        ArrayList al = new ArrayList();
        // 1. insertion In Array List
        al.add(1);
        al.add(2);
        al.add("vishal");
        // show array List
        System.out.println(al);
        // 1. insertion In Array List
        al.add(1,0);
        //traversal ArrayList
        for (Object a:al){
            System.out.print(a + " " );
        }
        System.out.println();
        //-------Second method of travesal-----------
//        for(int i=0; i<in.size();i++){
//          int n=in.get(i) ;
//            System.out.println(n);
//        }
        //-----Third method of traversal---

//        Iterator j= in.iterator(); {
//            while(j.hasNext()){
//                int m= (int) j.next();
//                System.out.println(m);
//            }
//        }

        // Search a element in ArrayList
        for ( Object a: al) {
            if(a.equals(1))
            {
                int ind=al.indexOf(1);
                System.out.println("element Found " +ind);
            }

        }
        int index= al.indexOf(1);
        System.out.println("Element found at index " +index);



        // Remove a element in arrayList
        al.remove(2);
        System.out.println(al);


    }
}
