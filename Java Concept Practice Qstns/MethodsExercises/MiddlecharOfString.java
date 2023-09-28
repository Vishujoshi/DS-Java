//3. Write a Java method to display the middle character of a string.
//        Note: a) If the length of the string is odd there will be two middle characters.
//        b) If the length of the string is even there will be one middle character.
//        Test Data:
//        Input a string: 350
//        Expected Output
class ex2{
    String middlechar(String s){
        int length =s.length();
        if(length%2==0){
            String ch1= String.valueOf(s.charAt(length/2-1));
            String ch2=String.valueOf(s.charAt(length/2));
            String ch=ch1 +ch2;
            return ch;
        }
        else {
            String ch= String.valueOf(s.charAt(length/2));
            return ch;

        }

    }
}
public class MiddlecharOfString {
    public static void main(String[] args) {
     ex2 a=new ex2();

        System.out.println(a.middlechar("1233"));
    }
}
