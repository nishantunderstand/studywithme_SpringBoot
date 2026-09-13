package jcf_ArrayList_Sorting_Comparator;

import java.util.*;

class ArrayListSortingWithCollection {
    public static void main(String[] args) {
        List<Integer> al1 = List.of(11, 99, 88, 22, 33, 44);
        // Arrays.sort(al1);
        // Collections.sort(al1); // java.lang.UnsupportedOperationException
        Collections.sort(new ArrayList<>(al1)); // Why it is working ??
        System.out.println(al1);
    }
}