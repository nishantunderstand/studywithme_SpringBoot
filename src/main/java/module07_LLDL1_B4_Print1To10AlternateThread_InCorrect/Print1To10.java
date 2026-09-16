package module07_LLDL1_B4_Print1To10AlternateThread_InCorrect;


class Printer{
    private int count = 1;

    public synchronized void print(){
        System.out.println(Thread.currentThread().getName( ) +" Count : "+ count++);
    }
}

// Print 1 to 10 Alternately Using Two Threads
public class Print1To10 {
    private static final int LIMIT = 5;
    public static void main(String[] args) throws Exception {
        Printer p = new Printer();
        Thread t1 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                p.print();
            }
        },"First");

        Thread t2 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                p.print();
            }
        },"Second");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
