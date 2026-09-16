package module07_LLDL1_B2a_Thread_AdderAndSubtractor_Thread;

public class Subtractor extends Thread{
    private final Counter count;

    public Subtractor(Counter count) {
        this.count = count;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            count.decrement();
        }
    }
}
