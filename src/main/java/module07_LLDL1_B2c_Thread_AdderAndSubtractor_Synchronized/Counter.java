package module07_LLDL1_B2c_Thread_AdderAndSubtractor_Synchronized;

public class Counter {
    public int count = 0;

    synchronized void increment() {
        System.out.println("Count : "+ count);
        count++;
    }

    synchronized void decrement() {
        System.out.println("Count : "+ count);
        count--;
    }
}