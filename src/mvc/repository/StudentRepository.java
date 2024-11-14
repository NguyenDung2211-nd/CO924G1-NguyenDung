package mvc.repository;

import mvc.entity.Student;

public class StudentRepository {
    private static Student[] students = new Student[10];
    static {
        students[0] = new Student(1, "HaiTT", "QN", 9);
    }

    public Student[] getAll() {
        return students;
    }
}
