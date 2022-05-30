package hr.xmjosic.studentdemoapp;

import hr.xmjosic.studentdemoapp.controller.StudentController;
import hr.xmjosic.studentdemoapp.dto.NewStudent;
import hr.xmjosic.studentdemoapp.model.Student;
import org.assertj.core.api.IteratorAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

@SpringBootTest
class StudentDemoAppApplicationTests {

    @Autowired private StudentController controller;

    @Test
    void getStudents() {
        Iterable<Student> result = controller.getStudents();
        Assertions.assertNotNull(result);
        Assertions.assertTrue(result.iterator().hasNext());
    }

    @Test
    void getStudentById() {
        Student result = controller.getStudentById(1L);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1L, result.getId());
    }

    @Test
    void addStudent() {
        Student result = controller.addStudent(new NewStudent("Chuck", "Norris", "male"));
        Assertions.assertNotNull(result);
        Assertions.assertNotNull(result.getId());
    }
}
