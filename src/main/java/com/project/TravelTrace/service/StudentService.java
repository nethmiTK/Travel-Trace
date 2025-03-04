package com.project.TravelTrace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
