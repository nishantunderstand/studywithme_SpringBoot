package jcf_ArrayList_Sorting_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Arraylist_7_Comparator {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Nishant", 25),
                new Student("Rahul", 20),
                new Student("Amit", 22)
        ));

        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.name().compareTo(s2.name());
            }
        });

        System.out.println(students);
        students.stream().forEach(System.out::println);

    }
}