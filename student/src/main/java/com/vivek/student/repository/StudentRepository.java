package com.vivek.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vivek.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
