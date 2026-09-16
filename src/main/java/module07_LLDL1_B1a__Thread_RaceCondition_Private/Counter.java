package module07_LLDL1_B1a__Thread_RaceCondition_Private;

public class Counter {
    private int count= 0;

    void increment(){
        count++;
    }


    public int getCount() {
        return count;
    }


//    Case 1 : Make Count Public
//    Case 2 : Make Count Private
}
