package com.example.courses_management.course_servlets;

import com.example.courses_management.controllers.Ccourses;
import com.example.courses_management.models.course;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet(name = "updateCourse_Servlet",value="/updateCourse")
public class updateCourse_Servlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            String id= (String) req.getAttribute("id");
            String Name=req.getParameter("name");
            String title=req.getParameter("title");
            String description=req.getParameter("description");
            String main_content=req.getParameter("main_content");
            course c=new course(Name,title,description,main_content);
            Ccourses Cc=new Ccourses();
            Cc.update(c,3);
            new afficheCourses(req,res);
        }
        catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }
}
