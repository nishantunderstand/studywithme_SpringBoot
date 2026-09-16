package module07_LLDL1_A_Thread;

public class Thread_2_Runnable {

    public static void main(String[] args) {
        // Java 7 and earlier
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a Thread");
            }
        });

        t1.start();

    }
}
