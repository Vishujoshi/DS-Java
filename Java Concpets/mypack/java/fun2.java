package mypack.java;

public class fun2 {
    public int area(int a,int b)throws Exception
    {
        if(a<0 ||  b<0){
            throw new Exception("Number should be positive");
        }
        int area;
        area = a*b;
        return area;

    }
}
