package com.bello.students.models;

import com.bello.students.enums.StudentsEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_STUDENTS")
public class StudentsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "studentName")
    private String name;
    @Column(name = "studentEmail")
    private String email;
    private int age;
    private StudentsEnum studentsEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentsEnum getStudentsEnum(){
        return studentsEnum;
    }

    public void setStudentsEnum(StudentsEnum studentsEnum){
        this.studentsEnum = studentsEnum;
    }

    public StudentsModel(){

    }
}
