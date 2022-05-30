package hr.xmjosic.studentdemoapp.service;

import hr.xmjosic.studentdemoapp.dto.NewStudent;
import hr.xmjosic.studentdemoapp.model.Student;

public interface StudentService {
  Iterable<Student> getStudents();

  Student getStudentById(Long id);

  Student addStudent(NewStudent student);
}
