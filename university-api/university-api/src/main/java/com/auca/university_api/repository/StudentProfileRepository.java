package com.auca.university_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auca.university_api.model.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}


