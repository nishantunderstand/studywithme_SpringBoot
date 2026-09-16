package module07_LLDL1_B1a__Thread_RaceCondition_Private;


/**
 * Code Demonstracte How Changing count to private impact the code.
 * Nothing else.
 */
public class AdderSubtracterProblem {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        });
        t1.start();
        t1.join();
        System.out.println(counter.getCount());
    }
}






