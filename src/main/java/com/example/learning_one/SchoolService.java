package com.example.learning_one;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;
//    private final StudentMapper studentMapper;


    public SchoolService(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }

    public SchoolResponseDto createSchool(SchoolDto schoolDto){
        var school = schoolMapper.toSchool(schoolDto);
        var savedSchool = schoolRepository.save(school);
        return schoolMapper.toSchoolResponseDto(savedSchool);
    }
    public List<SchoolDto> findAll(){
        return schoolRepository.findAll()
                .stream().map(schoolMapper::toSchoolDto)
                .collect(Collectors.toList());
    }
}
