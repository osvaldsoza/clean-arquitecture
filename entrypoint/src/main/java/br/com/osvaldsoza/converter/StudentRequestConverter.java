package br.com.osvaldsoza.converter;

import br.com.osvaldsoza.aluno.entity.Student;
import br.com.osvaldsoza.request.StudentRequest;
import org.springframework.stereotype.Component;

@Component
public class StudentRequestConverter {

    public Student toStudenty(StudentRequest studentRequest) {
        return new Student(studentRequest.getName());
    }
}
