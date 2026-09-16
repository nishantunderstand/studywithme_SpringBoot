package module07_LLDL1_B3_OddAndEven;

// Odd-Even Thread Synchronization
public class OddAndEven {
    private static final int LIMIT = 5;
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try {
                    c.printEven();
                } catch (Exception e) {
                    // throw new RuntimeException(e);
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try {
                    c.printOdd();
                } catch (Exception e) {
                    //throw new RuntimeException(e);
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
