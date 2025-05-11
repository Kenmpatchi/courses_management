package com.example.courses_management.course_servlets;

import com.example.courses_management.controllers.Ccourses;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.courses_management.models.course;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class afficheCourses extends HttpServlet {
    public afficheCourses(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try {
            Ccourses Cc = new Ccourses();
            String courses = "<table border=1>";
            for (course c : Cc.selectAll()) {
                courses += "<tr><td>" + c.getName() + "</td>" +
                        "<td><form action='deleteCourse' method='post'>" +
                        "    <input type='hidden' name='id' value='"+c.getCourse_id()+"'>" +
                        "    <input type='submit' value='delete'>" +
                        "</form></td>" +
                        "<td><form action='viewCourse' method='get'>" +
                        "<input type='hidden' name='id' value='"+c.getCourse_id()+"'>" +
                        "<input type='submit' value='view'>" +
                        "</form></td></tr>";
            }
            courses += "</table>";
            req.setAttribute("courses", courses);

            req.getRequestDispatcher("courses.jsp").forward(req, res);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}