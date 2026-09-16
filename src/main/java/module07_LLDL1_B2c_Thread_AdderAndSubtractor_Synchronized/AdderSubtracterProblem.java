package module07_LLDL1_B2c_Thread_AdderAndSubtractor_Synchronized;

public class AdderSubtracterProblem {
    private static final int LIMIT = 10;
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

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