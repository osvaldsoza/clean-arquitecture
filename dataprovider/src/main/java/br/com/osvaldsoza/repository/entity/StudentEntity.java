package br.com.osvaldsoza.repository.entity;

import br.com.osvaldsoza.aluno.entity.Student;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID registrstionNumber;
    private String name;

    public StudentEntity() {

    }

    public StudentEntity(Long id, UUID registrstionNumber, String name) {
        this(registrstionNumber,name);
        this.id = id;
    }

    public StudentEntity(UUID registrstionNumber, String name) {
        this.registrstionNumber = registrstionNumber;
        this.name = name;
    }

    public static StudentEntity from(Student student) {
        return new StudentEntity(student.getRegistrationNumber(),student.getName());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getRegistrstionNumber() {
        return registrstionNumber;
    }

    public void setRegistrstionNumber(UUID registrstionNumber) {
        this.registrstionNumber = registrstionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
