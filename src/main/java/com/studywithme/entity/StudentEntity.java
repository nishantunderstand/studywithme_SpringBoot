package com.studywithme.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="students")
public class StudentEntity {
    @Id
    // @GeneratedValue(strategy= GenerationType.AUTO) // You need to pass ID
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String course;
}

