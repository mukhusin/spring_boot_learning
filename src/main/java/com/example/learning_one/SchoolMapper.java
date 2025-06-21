package com.example.learning_one;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    public SchoolResponseDto toSchoolResponseDto(School school){
        return new SchoolResponseDto(school.getName());
    }

    public School toSchool(SchoolDto schoolDto){
        var school = new School();
        school.setName(schoolDto.name());
        return school;
    }

    public SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getName());
    }
}
