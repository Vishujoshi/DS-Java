class area{
    area(){
        System.out.println("dafault const");
    }
    area(int a,int b){
        System.out.println("param const " + a*b);
    }
}

public class Constructor {
    public static void main(String[] args) {
      area a=new area(1,32);


    }
}
