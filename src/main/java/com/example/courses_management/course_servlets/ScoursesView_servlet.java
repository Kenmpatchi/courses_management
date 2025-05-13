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

@WebServlet(name = "ScoursesView_servlet",value="/Student_view")
public class ScoursesView_servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        try{
            int group_id=Integer.parseInt(req.getParameter("group_id"));
            Ccourses Cc=new Ccourses();
            String courses = "<table border=1>";
            for (course c : Cc.selectAll(group_id)) {
                courses += "<tr><td>" + c.tostring() + "</td>" +
                        "<td><form action='viewCourse' method='get'>" +
                        "<input type='hidden' name='course_id' value='"+c.getCourse_id()+"'>" +
                        "<input type='submit' value='view'>" +
                        "</form></td></tr>";
            }
            courses+="</table>";
            req.setAttribute("courses",courses);
            req.getRequestDispatcher("Sview_courses.jsp").forward(req,res);
        }
        catch(SQLException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
