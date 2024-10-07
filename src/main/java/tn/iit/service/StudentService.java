package tn.iit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.iit.dto.StudentDto;

@Service
public class StudentService {
    private List<StudentDto> students = new ArrayList<>();

    public void save(StudentDto studentDto) {
        students.add(studentDto);
    }

    public List<StudentDto> findAll() {
        return students;
    }
}
