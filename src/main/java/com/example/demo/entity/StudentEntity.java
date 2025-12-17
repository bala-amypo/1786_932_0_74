package.com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity {

    @id
    @GeneratedValue(strategy = GeneratedValue.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
    
    public StudentEntity()
}