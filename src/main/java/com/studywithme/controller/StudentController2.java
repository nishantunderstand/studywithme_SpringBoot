package com.studywithme.controller;

import com.studywithme.dto.StudentResponseDTO;
import com.studywithme.repository.StudentRepository;
import com.studywithme.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/students")
public class StudentController2 {
    private final StudentService studentService;

    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }


}
