
import java.util.*;

public class MergeSort {


    public static void mergeSort(List<Student> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(List<Student> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        Student[] temp = new Student[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (arr.get(i).GPA < arr.get(j).GPA)
                temp[k++] = arr.get(i++);
            else
                temp[k++] = arr.get(j++);
        }

        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }

        while (j <= end) {
            temp[k++] = arr.get(j++);
        }

        for (i = start; i <= end; i++) {
            arr.remove(i);
            Student e = temp[i - start];
            arr.add(i, e);
        }
    }

    public static void main(String[] args) {
        //Random rangen = new Random();

        List<Student> arr1 = new ArrayList<Student>();
        List<Student> arr2 = new ArrayList<Student>();

        //for (int i = 0; i < 100; i++) {
        arr1.add(new Student(14, "Sam"));
        arr1.add(new Student(16, "Nick"));

        //}
        //for (int i = 0; i < 100; i++) {
        arr2.add(new Student(67, "Dora"));
        arr2.add(new Student(288, "Dick"));

        //}
        List<Student> finale = new ArrayList<Student>();

        finale.addAll(arr1);
        finale.addAll(arr2);



        /*for (int i = 0 ; i< 100; i++){

            finale.add(arr1.get(i));
            finale.add(arr2.get(i));

        }*/

        mergeSort(finale, 0, finale.size() - 1);

        for (int i = 0; i < finale.size(); i++) {
            System.out.println(finale.get(i).GPA + " " + finale.get(i).name);
        }

    }


}