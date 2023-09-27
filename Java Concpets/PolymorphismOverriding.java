
//runtime Polymorphism using method overriding

class SuperCompliletimePoly{
    public void sum(int a){
        int sum=a+a;
        System.out.println("Super " + sum);
    }
}
class subComplietimePoly extends SuperCompliletimePoly{
    @Override
    public void sum(int a) {
        int sum =a+a;
        System.out.println("sub " + sum);
    }
}


public class PolymorphismOverriding {
    public static void main(String[] args) {
        SuperCompliletimePoly s=new subComplietimePoly();
        SuperCompliletimePoly a=new SuperCompliletimePoly();
        s.sum(23);
        a.sum(234);
    }
}
