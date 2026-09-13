package jcf_ArrayList_Sorting_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Student(String name, int age) implements Comparable<Student> {

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age(), other.age());
    }
}

class Arraylist_6_Comparable {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Nishant", 25),
                new Student("Rahul", 20),
                new Student("Amit", 22)
        ));

        Collections.sort(students);

        System.out.println(students);

        students.stream().forEach(System.out::println);
    }
}