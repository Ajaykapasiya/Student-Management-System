package com.Ajay.studentManagementSystem.service;

import com.Ajay.studentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public void saveStudent(Student student);

    public Student getById(Long id);

    public void deleteById(Long id);


}
