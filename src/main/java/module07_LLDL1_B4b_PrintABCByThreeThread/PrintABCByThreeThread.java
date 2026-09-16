package module07_LLDL1_B4b_PrintABCByThreeThread;

class Printer{
    private String str = "";
    private int turn = 0;

    public synchronized String getString(){
        return str;
    }

    public synchronized void print(String s, int expectedTurn) throws Exception{
        try{
            while(turn !=expectedTurn){
                wait();
            }
            str += s;
            System.out.println(Thread.currentThread().getName()+":->"+str);
            // System.out.println(str);
            turn = (turn+1)%3;
            notifyAll();
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}

public class PrintABCByThreeThread {
    public static final int LIMIT = 2;
    public static void main(String[] args) throws Exception{
        Printer p = new Printer();

        Thread t1 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    p.print("A",0);
                }catch(Exception e){
                    Thread.currentThread().interrupted();
                    return;
                }
            }
        },"A");

        Thread t2 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    p.print("B",1);
                }catch(Exception e){
                    Thread.currentThread().interrupted();
                    return;
                }
            }
        },"B");

        Thread t3 = new Thread(()->{
            for(int i=0;i<LIMIT;i++){
                try{
                    p.print("C",2);
                }catch(Exception e){
                    Thread.currentThread().interrupted();
                    return;
                }
            }
        },"C");

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Output String : " + p.getString());
    }
}
