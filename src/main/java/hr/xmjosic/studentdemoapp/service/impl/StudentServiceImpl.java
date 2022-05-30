package hr.xmjosic.studentdemoapp.service.impl;

import hr.xmjosic.studentdemoapp.converter.NewStudentToStudentConverter;
import hr.xmjosic.studentdemoapp.dao.StudentRepository;
import hr.xmjosic.studentdemoapp.dto.NewStudent;
import hr.xmjosic.studentdemoapp.exception.NoStudentException;
import hr.xmjosic.studentdemoapp.model.Student;
import hr.xmjosic.studentdemoapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static java.util.Objects.requireNonNull;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
  private final StudentRepository repository;
  private final NewStudentToStudentConverter newStudentToStudentConverter;

  @Override
  public Iterable<Student> getStudents() {
    return repository.findAll();
  }

  @Override
  public Student getStudentById(Long id) {
    return repository.findById(id).orElseThrow(NoStudentException::new);
  }

  @Override
  public Student addStudent(NewStudent student) {
    Student newStudent = newStudentToStudentConverter.convert(student);
    requireNonNull(newStudent, "Student object must not be null.");
    return repository.save(newStudent);
  }
}
