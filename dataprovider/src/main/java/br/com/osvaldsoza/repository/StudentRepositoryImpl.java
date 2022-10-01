package br.com.osvaldsoza.repository;

import br.com.osvaldsoza.aluno.contract.StudentRepository;
import br.com.osvaldsoza.aluno.entity.Student;
import br.com.osvaldsoza.repository.entity.StudentDAO;
import br.com.osvaldsoza.repository.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public void save(Student student) {
        studentDAO.save(StudentEntity.from(student));
    }
}
