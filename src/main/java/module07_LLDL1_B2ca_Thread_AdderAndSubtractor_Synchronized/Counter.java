package module07_LLDL1_B2ca_Thread_AdderAndSubtractor_Synchronized;

public class Counter {
    public int count = 0;

    private final Object LOCK = new Object();

    void increment() {
        synchronized(LOCK){
            System.out.println("Count : "+ count);
            count++;
        }
    }

    void decrement() {
        synchronized(LOCK){
            System.out.println("Count : "+ count);
            count--;
        }
    }
}