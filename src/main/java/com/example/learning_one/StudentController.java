package com.example.learning_one;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public StudentResponseDto saveStudent(
            @RequestBody StudentDto dto
    ){
      return this.studentService.saveStudent(dto);
    }

    @GetMapping("/students")
    public List<StudentResponseDto> findAllStudent(){
        return studentService.findAllStudent();
    }


    @GetMapping("/students/{student-id}")
    public StudentResponseDto findStudentById(
            @PathVariable("student-id") Integer id
    ){
        return this.studentService.findStudentById(id);
    }

    @GetMapping("/students/search/{student-name}")
    public List<StudentResponseDto> findStudentByName(
            @PathVariable("student-name") String studentName
    ){
        return studentService.findStudentByName(studentName);
    }

    @DeleteMapping("/students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(
            @PathVariable("student-id") Integer id
    ){
        studentService.deleteStudentById(id);
    }


//    @GetMapping("/hello")
//    public String sayHello(){
//        return "<h1>Hello2 from my first controller</h1>";
//    }


    //    @GetMapping("/hello2")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public String sayHello2(){
//        return "<h1>Hello from my first controller</h1>";
//    }

//    @PostMapping("/post-order")
//    public String post(
//            @RequestBody Order order
//    ){
//        return "Request accepted and order is : "+ order.toString();
//    }
//
//    @PostMapping("/post-order-record")
//    public String postRecord(
//            @RequestBody OrderRecord orderRecord
//    ){
//        return "Request accepted and order is : "+ orderRecord.toString();
//    }
//
//    //http://localhost:8080/hello/mukhusin
//    @GetMapping("/hello/{user-name}")
//    public String pathVar(
//           @PathVariable("user-name") String userName
//    ){
//        return "my value = " + userName;
//    }
//
//    //http://localhost:8080/hello?param_name=paramValue&param_name_2=value_2
//    @GetMapping("/hello")
//    public String paramVar(
//            @RequestParam("user-name") String userName,
//            @RequestParam("user-lastname") String lastName
//    ){
//        return "my value = " + userName + " " + lastName;
//    }
}
