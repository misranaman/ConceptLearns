package object_sorting;

import java.util.Arrays;
import java.util.Comparator;

public class TestObjectSorting {

    public static void main(String[] args) {
        Student avi = new Student("Avi", "Lucknow", 10);
        Student mavi = new Student("Mavi", "Gurgaon", 12);
        Student tan = new Student("Tan", "Noida", 11);

        Student[] students = {avi, mavi, tan};

        //Comparable
        //Arrays.sort(students);

        //Name Comparator
        //Arrays.sort(students, new NameComparator());

        //Age Comparator
        //Arrays.sort(students, new AgeComparator());

        //Address Comparator
        Arrays.sort(students, new AddressComparator());

        for (Student s : students)
            System.out.println(s);
    }
}
