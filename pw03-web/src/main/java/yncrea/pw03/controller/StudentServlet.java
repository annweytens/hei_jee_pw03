package yncrea.pw03.controller;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yncrea.pw03.entity.Student;
import yncrea.pw03.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@WebServlet(urlPatterns = "/students")



public class StudentServlet extends HttpServlet{

    StudentService studentService;
    ConfigurableApplicationContext configurableApplicationContext;
    private List<Student> students;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        students=studentService.findAll();
        request.setAttribute("students",students);
        request.getRequestDispatcher("Students.jsp").forward(request,response);
    }

    @Override
    public void destroy() {
        configurableApplicationContext.close();
    }

    @Override
    public void init() throws ServletException {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("yncrea.pw03.config");
        studentService = context.getBean(StudentService.class);
    }



}
