package hr.xmjosic.studentdemoapp.config;

import hr.xmjosic.studentdemoapp.dao.StudentRepository;
import hr.xmjosic.studentdemoapp.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static hr.xmjosic.studentdemoapp.model.Gender.FEMALE;
import static hr.xmjosic.studentdemoapp.model.Gender.MALE;

@Configuration
@RequiredArgsConstructor
public class InitialH2DBDataInserter {
  private final StudentRepository repository;

  @Bean
  public ApplicationRunner applicationRunner() {
    return args -> {
      repository.save(Student.builder().firstName("Joe").lastName("Doe").gender(MALE).build());
      repository.save(Student.builder().firstName("Jane").lastName("Doe").gender(FEMALE).build());
    };
  }
}
