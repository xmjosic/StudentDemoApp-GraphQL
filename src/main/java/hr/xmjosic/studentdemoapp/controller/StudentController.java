package hr.xmjosic.studentdemoapp.controller;

import hr.xmjosic.studentdemoapp.dto.NewStudent;
import hr.xmjosic.studentdemoapp.model.Student;
import hr.xmjosic.studentdemoapp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Controller
@RequiredArgsConstructor
public class StudentController {

  private final StudentService service;

  @QueryMapping
  public Iterable<Student> getStudents() {
    return service.getStudents();
  }

  @QueryMapping
  public Student getStudentById(@Argument @NotNull Long id) {
    return service.getStudentById(id);
  }

  @MutationMapping
  public Student addStudent(@Argument @Valid NewStudent student) {
    return service.addStudent(student);
  }
}
