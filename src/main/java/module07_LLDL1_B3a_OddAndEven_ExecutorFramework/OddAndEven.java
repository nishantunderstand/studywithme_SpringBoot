package module07_LLDL1_B3a_OddAndEven_ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddAndEven {
    private static final int LIMIT = 5;
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();
        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.submit(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    c.printEven();
                }catch(Exception e){
                    Thread.currentThread().interrupt(); // Explain me
                }
            }
        });


        ex.submit(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    c.printOdd();
                }catch(Exception e){
                    Thread.currentThread().interrupt(); // Explain me
                }
            }
        });


    }
}
