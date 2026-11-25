package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {

        return studentRepository.save(student);

    }

    public List<Student> getAllStudents() {

        return studentRepository.findAll();

    }

    public void deleteStudent(Long id) {

        studentRepository.deleteById(id);

    }
}