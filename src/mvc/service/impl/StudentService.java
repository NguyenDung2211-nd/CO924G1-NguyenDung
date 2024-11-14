package mvc.service.impl;

import mvc.entity.Student;
import mvc.repository.StudentRepository;
import mvc.service.IStudentService;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public Student[] getAll() {
        return studentRepository.getAll();
    }
}
