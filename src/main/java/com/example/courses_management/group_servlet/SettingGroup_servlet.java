package com.example.courses_management.group_servlet;

import com.example.courses_management.controllers.Cgroups;
import com.example.courses_management.model.group;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet(name="SettingGroup_servlet",value="/Groupsetting")
public class SettingGroup_servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        try{
            int professor_id=Integer.parseInt(req.getParameter("professor_id"));
            String name=req.getParameter("name");
            String theme=req.getParameter("theme");
            Cgroups Cg=new Cgroups();
            group g=new group(professor_id,name,theme);
            Cg.insert(g);
            new viewGroups(professor_id,req,res);
        }
        catch(SQLException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        try{
            int professor_id=Integer.parseInt(req.getParameter("professor_id"));
            int group_id=Integer.parseInt(req.getParameter("group_id"));
            Cgroups Cg=new Cgroups();
            Cg.delete(group_id);
            new viewGroups(professor_id,req,res);
        }
        catch(SQLException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
