package module07_LLDL1_B2cab_Thread_AdderAndSubtractor_RetrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    public int count = 0;

    private final ReentrantLock LOCK = new ReentrantLock();


    void increment() {
        LOCK.lock();
        System.out.println("Count : " + count);
        count++;
        LOCK.unlock();
    }

    void decrement() {
        LOCK.lock();
        System.out.println("Count : " + count);
        count--;
        LOCK.unlock();

    }
}