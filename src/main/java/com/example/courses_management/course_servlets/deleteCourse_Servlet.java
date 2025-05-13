package com.example.courses_management.course_servlets;

import com.example.courses_management.controllers.Ccourses;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name="deleteCourse_Servlet",value = "/deleteCourse")
public class deleteCourse_Servlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            int course_id=Integer.parseInt(req.getParameter("course_id"));
            Ccourses cc=new Ccourses();
            int group_id=cc.selectbyid(course_id).getGroup_id();
            cc.delete(course_id);
            new viewCourses(group_id,req,res);
        }
        catch(SQLException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
