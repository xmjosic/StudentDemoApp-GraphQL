package hr.xmjosic.studentdemoapp.converter;

import hr.xmjosic.studentdemoapp.dto.NewStudent;
import hr.xmjosic.studentdemoapp.model.Student;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import static hr.xmjosic.studentdemoapp.model.Gender.fromCode;

@Component
public class NewStudentToStudentConverter implements Converter<NewStudent, Student> {
  @Override
  public Student convert(NewStudent source) {
    return Student.builder()
        .firstName(source.firstName())
        .lastName(source.lastName())
        .gender(fromCode(source.gender()))
        .build();
  }
}
