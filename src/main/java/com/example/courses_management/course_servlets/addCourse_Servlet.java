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

@WebServlet(name = "addCourse_servlet",value = "/addCourse")
public class addCourse_Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            int group_id=Integer.parseInt(req.getParameter("group_id"));
            String Name=req.getParameter("name");
            String title=req.getParameter("title");
            String description=req.getParameter("description");
            String main_content=req.getParameter("main_content");
            course c=new course(Name,title,description,main_content);
            Ccourses Cc=new Ccourses();
            Cc.insert(c,group_id);

            new viewCourses(group_id,req,res);
        }
        catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }

}
