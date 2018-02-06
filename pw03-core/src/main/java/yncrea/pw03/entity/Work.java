package yncrea.pw03.entity;

import javax.persistence.*;

@Entity
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @ManyToOne
    private Course course;

    @Column(name="grade")
    private int grade;


    public Work() {
    }

    public Work(String name, Integer grade, Course course) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
