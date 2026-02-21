package com.vivek.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.student.model.Student;
import com.vivek.student.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Create
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Read All
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // Read By ID
    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    // Update
    public Student updateStudent(Long id, Student student) {
        Student existing = repository.findById(id).orElseThrow();
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
         return repository.save(existing);
    }

    // Delete
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}