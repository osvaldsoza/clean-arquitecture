package br.com.osvaldsoza.aluno.entity;

import java.util.UUID;

public class Student {

    private UUID registrationNumber;

    private String name;

    public Student(String name) {
        this.name = name;
        this.registrationNumber = UUID.randomUUID();
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }
}
