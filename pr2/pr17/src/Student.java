public class Student extends LabClass{
    private String name;
    private double averageGrade;

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public double compareStudents(Student student1, Student student2){
        return Double.compare(student2.getAverageGrade(), student1.getAverageGrade());
    }

    public static void quickSort(Student[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(Student[] arr, int low, int high) {
        double pivot = arr[high].getAverageGrade();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getAverageGrade() >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
    }
    public static void swap(Student[] arr, int i, int j) {
        Student temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        Student[] students = {new Student("Иванов", 19.5), new Student("Кси", 20.0), new Student("Жёлобов", 14.5)};
        System.out.println("Students before sorting");
        for (Student student : students){
            System.out.println(student);
        }
        quickSort(students, students.length - 1, 2);
    }
}

