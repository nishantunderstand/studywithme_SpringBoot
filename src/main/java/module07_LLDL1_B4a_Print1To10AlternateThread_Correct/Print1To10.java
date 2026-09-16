package module07_LLDL1_B4a_Print1To10AlternateThread_Correct;


class Printer{
    private int count = 1;
    private boolean firstTurn = true;

    public synchronized void print(boolean isFirst) throws InterruptedException{
        while(firstTurn!=isFirst){
            wait();
        }

        System.out.println(Thread.currentThread().getName( ) +" Count : "+ count++);
        firstTurn = !firstTurn;
        notifyAll();
    }
}

// Print 1 to 10 Alternately Using Two Threads
public class Print1To10 {
    private static final int LIMIT = 5;
    public static void main(String[] args) throws Exception {
        Printer p = new Printer();

        Thread t1 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    p.print(true);
                }catch(Exception e){
                    Thread.currentThread().isInterrupted();
                    return;
                }
            }
        },"First");

        Thread t2 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    p.print(false);
                }catch(Exception e){
                    Thread.currentThread().isInterrupted();
                    return;
                }
            }
        },"Second");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
