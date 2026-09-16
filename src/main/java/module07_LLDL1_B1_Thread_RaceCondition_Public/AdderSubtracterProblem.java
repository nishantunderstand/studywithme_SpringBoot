package module07_LLDL1_B1_Thread_RaceCondition_Public;

// Classic Synchronization Problem
public class AdderSubtracterProblem {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();


        Thread adder = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        Thread subtracter = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.decrement();
            }
        });

        adder.start();
        subtracter.start();

        adder.join();
        subtracter.join(); // If you use Join then you handle exception as well.

        System.out.println("Final Count: " + counter.count);
    }
}

//Case 1 : Don't write Join
//Case 2 : Write Join, Then you need to handle Exception