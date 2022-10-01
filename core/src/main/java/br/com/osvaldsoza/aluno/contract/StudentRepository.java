package br.com.osvaldsoza.aluno.contract;

import br.com.osvaldsoza.aluno.entity.Student;

public interface StudentRepository {

    void save(Student student);
}
