package yncrea.pw03.service.impl;

import org.springframework.transaction.annotation.Transactional;
import yncrea.pw03.dao.StudentDAO;
import yncrea.pw03.entity.Student;
import yncrea.pw03.service.StudentService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class StudentServiceImpl implements StudentService {



    @Inject
    private StudentDAO studentDAO;




    @Override
    public List<Student> findByLastname(String lastname) {
        return studentDAO.findByLastname(lastname);
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.save(student);
    }

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();

    }
}
