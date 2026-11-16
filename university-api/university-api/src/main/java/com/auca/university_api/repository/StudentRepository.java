package com.auca.university_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auca.university_api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
