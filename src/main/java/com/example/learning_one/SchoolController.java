package com.example.learning_one;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/schools")
    public SchoolResponseDto createSchool(
           @RequestBody SchoolDto schoolDto
    ){
        return schoolService.createSchool(schoolDto);

    }


    @GetMapping("/schools")
   public List<SchoolDto> findAll(){
        return schoolService.findAll();
    }
}
