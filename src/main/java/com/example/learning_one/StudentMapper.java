package com.example.learning_one;

import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    public StudentResponseDto toStudentResponseDto(Student student){
        return new StudentResponseDto(
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }

    public Student toStudent(StudentDto dto){
        var student = new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        var school = new School();
        school.setId(dto.schoolId());
        student.setSchool(school);
        return student;
    }
}
