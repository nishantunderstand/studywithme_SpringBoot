package com.studywithme.service;

import com.studywithme.dto.StudentResponseDTO;
import com.studywithme.entity.StudentEntity;
import com.studywithme.reposistory.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentResponseDTO findStudentById(Long id) {
        StudentEntity st = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("Student Not Found"));
        StudentResponseDTO response = new StudentResponseDTO();
        return StudentResponseDTO
                .builder()
                .id(st.getId())
                .name(st.getName())
                .email(st.getEmail())
                .course(st.getCourse())
                .build();
    }
}
