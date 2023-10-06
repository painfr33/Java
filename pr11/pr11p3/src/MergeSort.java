import java.util.*;

import static java.util.Collections.sort;

public class MergeSort {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(21, "Maxim"));
        studentList1.add(new Student(10, "Ilya"));
        studentList1.add(new Student(8, "Sam"));
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(16, "Lucy"));
        studentList2.add(new Student(15, "Dave"));
        studentList2.add(new Student(9, "Rex"));




        List<Student> mergedStudentList = mergeSort(studentList1, studentList2);
        System.out.println("Merged and sorted student list:");
        for (Student student : mergedStudentList) {
            System.out.println("Student ID: " + student.getStudentID() + ", Name: " + student.getName());
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.compareTo(student2) > 0) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
