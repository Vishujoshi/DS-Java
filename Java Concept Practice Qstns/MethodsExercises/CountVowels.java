import java.lang.reflect.Array;
import java.util.Arrays;

//4. Write a Java method to count all vowels in a string.
//Test Data:
//Input the string: w3resource
//Expected Output:
//
//Number of  Vowels in the string: 4
//5. Write a Java method to count all the words in a string.
//Test Data:
//Input the string: The quick brown fox jumps over the lazy dog.
//Expected Output:
//
//Number of words in the string: 9
class ex3{
    void count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== 'a' || s.charAt(i)== 'e' ||s.charAt(i)== 'i' ||s.charAt(i)== 'o' ||s.charAt(i)== 'u'){
                c++;
            }

        }
        System.out.println(c);
    }
    void countWords(String s){
        int c=0;
        String words[]=s.split(" ");
        c= words.length;



        System.out.println(c);
        System.out.println(Arrays.toString(words));
    }
}
public class CountVowels {
    public static void main(String[] args) {
        ex3 s=new ex3();
        s.count("w3resource");
        s.countWords("The quick brown fox jumps over the lazy dog.");
    }
}
