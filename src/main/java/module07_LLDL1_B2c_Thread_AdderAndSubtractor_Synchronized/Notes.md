Correct Syntax ::

synchronized void increment()
void synchronized increment()


A variable can live at different levels

Class
│
├── Class-level variable
│      └── private static final int LIMIT = 10000;
│
└── Method
│
├── Local variable
│      └── int x = 10;
│
└── statements


public class AdderSubtracterProblem {
private static final int LIMIT = 10; 
    public static void main(String[] args) throws InterruptedException { 
        private static final int LIMIT = 10000; // You cannot declare inside a METHOD

