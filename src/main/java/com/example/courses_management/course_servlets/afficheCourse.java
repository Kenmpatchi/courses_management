package com.example.courses_management.course_servlets;

import com.example.courses_management.controllers.Ccourses;
import com.example.courses_management.model.course;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "afficheCourse_servlet",value = "/viewCourse")
public class afficheCourse extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try {
            int id=Integer.parseInt(req.getParameter("id"));
            Ccourses Cc = new Ccourses();
            course c=Cc.selectbyid(id);
            String name=c.getName();
            String Course="<h1>"+c.getTitle()+"</h1><br>" +
                    "<h2>"+c.getDescription()+"</h2><br>" +
                    "<p>"+c.getMain_content()+"</p>";
            req.setAttribute("course",Course);
            req.setAttribute("name",name);
            req.getRequestDispatcher("viewCourse.jsp").forward(req, res);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
