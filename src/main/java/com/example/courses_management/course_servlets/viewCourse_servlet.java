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

@WebServlet(name = "viewCourse_servlet",value = "/viewCourse")
public class viewCourse_servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try {
            int course_id=Integer.parseInt(req.getParameter("course_id"));
            Ccourses Cc = new Ccourses();
            course c=Cc.selectbyid(course_id);
            String name=c.getName();
            String Course="<h1>"+c.getTitle()+"</h1>" +
                    "<h2>"+c.getDescription()+"</h2>" +
                    "<p>"+c.getMain_content()+"</p>";
            req.setAttribute("course",Course);
            req.setAttribute("name",name);
            req.getRequestDispatcher("viewCourse.jsp").forward(req, res);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
