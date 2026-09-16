package module07_LLDL1_B2a_Thread_AdderAndSubtractor_Thread;

public class Adder extends Thread{
    private final Counter count; // If you add final then you need to add constrcutor Injecton

    public Adder(Counter count) {
        this.count = count;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            count.increment();
        }
    }
}
