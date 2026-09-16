package module07_LLDL1_B2caba_Thread_AdderAndSubtractor_RetrantLock_StandardOne;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    public int count = 0;

    private final ReentrantLock LOCK = new ReentrantLock();


    void increment() {
        LOCK.lock();
        try{
            System.out.println("Count : " + count);
            count++;
        }finally{
            LOCK.unlock();
        }
    }

    void decrement() {
        LOCK.lock();
        try{
            System.out.println("Count : " + count);
            count--;
        }finally{
            LOCK.unlock();
        }
    }
}