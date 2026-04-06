package JavaLab4Networking.Question50.springCodes.service;

import JavaLab4Networking.Question50.springCodes.model.Student;
import java.util.List;

public interface StudentService {
    void addStudent(Student student);
    void updateStudent(Student student);
    void removeStudent(int id);
    Student getStudentById(int id);
    List<Student> getAllStudents();
}
