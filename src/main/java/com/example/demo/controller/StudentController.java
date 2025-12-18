package com.example.demo.controller;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demoaiml.entity.Student;
import com.example.demoaiml.service.StudentService;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
private final StudentService service;
public StudentController(StudentService service) {
this.service = service;
}
// CREATE
@PostMapping
public ResponseEntity<Student> createStudent(@Valid @RequestBodyStudent student) {
return new ResponseEntity<>(service.saveStudent(student),HttpStatus.CREATED);
}
// READ ALL
@GetMapping
public List<Student> getAllStudents() {
return service.getAllStudents();
}
// READ BY ID
@GetMapping("/{id}")
public Student getStudent(@PathVariable Long id) {
return service.getStudentById(id);
}
// UPDATE
@PutMapping("/{id}")
public Student updateStudent(@PathVariable Long id,
@Valid @RequestBody Student student){
return service.updateStudent(id, student);
}
// DELETE
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteStudent(@PathVariable Longid) {
service.deleteStudent(id);
return ResponseEntity.ok("Student deleted successfully");}
}