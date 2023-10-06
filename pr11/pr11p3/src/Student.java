class Student implements Comparable<Student> {
    private int studentID;
    private String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student  o) {
        return this.studentID - o.studentID;
    }
}
