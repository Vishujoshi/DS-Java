class Mythread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println("hello thread " + i);
            i++;
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        int i=1;
        while(true){
            System.out.println("hello main " + i);
            i++;
        }
    }
}
