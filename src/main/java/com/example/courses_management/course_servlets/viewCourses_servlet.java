package com.example.courses_management.course_servlets;

import com.example.courses_management.controllers.Ccourses;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.courses_management.model.course;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet(name = "viewCourses_servlet",value = "/view")
public class viewCourses_servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try {
            int group_id=Integer.parseInt(req.getParameter("group_id"));
            Ccourses Cc = new Ccourses();
            String courses = "<table border=1>";
            for (course c : Cc.selectAll(group_id)) {
                courses += "<tr><td>" + c.getName() + "</td>" +
                        "<td><form action='deleteCourse' method='post'>" +
                        "    <input type='hidden' name='course_id' value='"+c.getCourse_id()+"'>" +
                        "    <input type='submit' value='delete'>" +
                        "</form></td>" +
                        "<td><form action='viewCourse' method='get'>" +
                        "<input type='hidden' name='course_id' value='"+c.getCourse_id()+"'>" +
                        "<input type='submit' value='view'>" +
                        "</form></td>" +
                        "<td><a href='Pupdate_course.jsp?course_id="+c.getCourse_id()+"'>update</a></td></tr>";
            }
            courses += "</table>";
            req.setAttribute("courses", courses);
            req.setAttribute("group_id",group_id);
            req.getRequestDispatcher("Pview_courses.jsp").forward(req, res);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}