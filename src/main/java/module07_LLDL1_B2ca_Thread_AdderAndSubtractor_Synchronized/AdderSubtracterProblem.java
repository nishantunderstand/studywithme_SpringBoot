package module07_LLDL1_B2ca_Thread_AdderAndSubtractor_Synchronized;

public class AdderSubtracterProblem {
    private static final int LIMIT = 10;
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println("====== Wednesday, September 16, 2026 12:39:27 PM ======");
        Thread adder = new Thread(() -> {
            for (int i = 0; i < LIMIT; i++) {
                counter.increment();
            }
        });
        Thread subtracter = new Thread(() -> {
            for (int i = 0; i < LIMIT; i++) {
                counter.decrement();
            }
        });

        adder.start();
        subtracter.start();

        adder.join();
        subtracter.join();

        System.out.println("Count: " + counter.count);
    }
}