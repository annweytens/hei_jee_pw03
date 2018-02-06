package yncrea.pw03.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname", nullable=false)
    private String lastname;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="student")
    private List<Course> courses;



    public Student() {

    }

    public Student(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}

