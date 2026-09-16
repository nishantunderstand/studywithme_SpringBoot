package module07_LLDL1_B3a_OddAndEven_ExecutorFramework;

public class Counter {
    private int count =1;

    synchronized void printOdd() throws Exception{
        while(count%2==0){
            wait();
        }
        System.out.println("Odd : "+count++);
        notifyAll();
    }

    synchronized void printEven() throws Exception{
        while(count%2==1){
            wait();
        }
        System.out.println("Even : "+count++);
        notifyAll();
    }
}
