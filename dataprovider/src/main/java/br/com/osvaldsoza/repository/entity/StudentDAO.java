package br.com.osvaldsoza.repository.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<StudentEntity,Long> {
}
