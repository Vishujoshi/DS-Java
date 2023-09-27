class parent{
    String fathername="mahindra";
    void showname(){

        System.out.println(fathername);
    }
    parent(){
        System.out.println("parent non param const");
    }
    parent(int a){
        System.out.println("parent  param const" + a);
    }

}

class child extends parent{
    String childname="thar";
    void showname(){


        System.out.println(childname);
        System.out.println(fathername);
    }

    child(){
        System.out.println("child non param const");
    }
    child(int a){
        System.out.println("child param const");
    }

    child(int a,int b){
        super(a);
        System.out.println("child 2-param const " + a + " " + b);
    }

}

public class inheritance {
    public static void main(String[] args) {
   child s=new child(1,2);
   s.showname();
    }
}
