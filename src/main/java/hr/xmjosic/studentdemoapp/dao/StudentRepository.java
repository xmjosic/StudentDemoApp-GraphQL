package hr.xmjosic.studentdemoapp.dao;

import hr.xmjosic.studentdemoapp.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {}
