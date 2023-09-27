import java.util.Scanner;

public class AreaOfTrraingle {
    public static void main(String[] args) {

        int area=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter base and height");
        int b=s.nextInt();
        int h=s.nextInt();
        area=(b*h)*1/2;
        System.out.println("Araa of Triangle = " + area);
    }
}
