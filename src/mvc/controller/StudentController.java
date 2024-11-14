package mvc.controller;

import mvc.entity.Student;
import mvc.service.IStudentService;
import mvc.service.impl.StudentService;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public Student[] display() {
        return studentService.getAll();
    }
}
