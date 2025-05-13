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
@WebServlet(name = "updateCourse_Servlet",value="/updateCourse")
public class updateCourse_Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            int course_id= Integer.parseInt(req.getParameter("course_id"));
            String Name=req.getParameter("name");
            String title=req.getParameter("title");
            String description=req.getParameter("description");
            String main_content=req.getParameter("main_content");
            course c=new course(Name,title,description,main_content);
            Ccourses Cc=new Ccourses();
            Cc.update(c,course_id);
            new viewCourses(Cc.selectbyid(course_id).getGroup_id(),req,res);
        }
        catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("id",id);
        req.getRequestDispatcher("Pupdate_course.jsp").forward(req, res);
    }
}
