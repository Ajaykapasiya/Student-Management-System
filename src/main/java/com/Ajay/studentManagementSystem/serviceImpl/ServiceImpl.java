package com.Ajay.studentManagementSystem.serviceImpl;

import com.Ajay.studentManagementSystem.entity.Student;
import com.Ajay.studentManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceImpl implements StudentService {

    @Autowired
    com.Ajay.studentManagementSystem.repository.StudentRepository StudentRepository;

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = StudentRepository.findAll();
        return list;
    }

    @Override
    public void saveStudent(Student student) {
        StudentRepository.save(student);
    }

    @Override
    public Student getById(Long id) {
        return StudentRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
StudentRepository.deleteById(id);
    }


}
