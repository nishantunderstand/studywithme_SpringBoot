package module07_LLDL1_B1_Thread_RaceCondition_Public;


// module07_LLDL1_B1_Thread_ClassicRaceCondition_Demonstrate_Count_Public
public class Counter {
    public int count = 0;

    void increment() {
        count++;   // NOT atomic
    }

    void decrement() {
        count--;   // NOT atomic
    }
}