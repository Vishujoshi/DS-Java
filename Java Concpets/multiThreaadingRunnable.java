public class multiThreaadingRunnable implements Runnable {

    @Override
    public void run() {
        int i=1;
        while(true){
            System.out.println("hello thread " + i);
            i++;
        }
    }

    public static void main(String[] args) {

        multiThreaadingRunnable t=new multiThreaadingRunnable();
        Thread s=new Thread(t);
        s.start();
        int i=1;
        while(true){
            System.out.println("hello main " + i);
            i++;
        }
    }
}
