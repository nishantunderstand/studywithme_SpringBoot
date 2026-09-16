package module07_LLDL1_B2a_Thread_AdderAndSubtractor_Thread;

public class AdderAndSubtractor {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        Adder ad = new Adder(c);
        Subtractor sb = new Subtractor(c);

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sb);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count : " + c.getCount());
    }
}
