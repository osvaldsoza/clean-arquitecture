package br.com.osvaldsoza.aluno.usecase;

import br.com.osvaldsoza.aluno.contract.StudentRepository;
import br.com.osvaldsoza.aluno.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentRecord {

    private StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }
}
