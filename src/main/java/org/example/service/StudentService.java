package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class StudentService {

    @Autowired
    StudentRepository studentRepository;

//    public StudentService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
