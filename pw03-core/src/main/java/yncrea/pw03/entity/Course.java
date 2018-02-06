package yncrea.pw03.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="validated")
    private boolean validated;

    @Column(name="name")
    private String name;

    @ManyToOne
    private Student student;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="course")
    private List<Work> works;



    public Course() {
    }

    public Course(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public long getId() {
        return id;
    }


    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Work> getWorks() {
        return works;
    }

    public void setWorks(List<Work> works) {
        this.works = works;
    }
}