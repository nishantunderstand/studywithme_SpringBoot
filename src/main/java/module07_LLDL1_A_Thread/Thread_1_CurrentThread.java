package module07_LLDL1_A_Thread;

import java.util.Arrays;
import java.util.List;

public class Thread_1_CurrentThread {

  public static void main(String[] args) {
      List<Integer> ListOfNumber = Arrays.asList(1,2,3,4,5);
      ListOfNumber.stream().forEach(number ->System.out.println(number +" " + Thread.currentThread().getName()));
  }
}
