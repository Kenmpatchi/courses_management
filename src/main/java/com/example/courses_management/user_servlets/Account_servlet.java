package com.example.courses_management.user_servlets;

import com.example.courses_management.controllers.Cusers;
import com.example.courses_management.model.user;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "account_servlet",value = "/account")
public class Account_servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        try{
         String first_name=req.getParameter("first_name");
         String last_name =req.getParameter("last_name");
         String email=req.getParameter("email");
         int phone=Integer.parseInt(req.getParameter("phone"));
         String password=req.getParameter("password");
         String valpass=req.getParameter("valpass");
         if(!password.equals(valpass))throw new IOException("invalide password");
         user user=new user(first_name,last_name,email,phone,password);
            Cusers User=new Cusers();
            User.insert(user);
            req.getRequestDispatcher("main.jsp").forward(req,res);
        }
        catch(SQLException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        try{
            String email=req.getParameter("email");
            String password=req.getParameter("password");
            Cusers User=new Cusers();
            user data=User.selectOne(email);
            if(!password.equals(data.getPassword()))throw new IOException("invalide password");
            if(data.getRole().equals("admin")){
                String users="<table>";
                for(user usr:User.selectAll()){
                    users+="<tr><td>"+usr.getFirst_name()+"</td><td>"+usr.getLast_name()+"</td><td>"+usr.getEmail()+"</td>" +
                            "<td><form action='role' method=''><select value="+usr.getRole()+" name='change_role'><opt>professor</opt><opt>student</opt><opt>admin</opt></select>" +
                            "<input type='hidden' value="+usr.getId()+"><input type='submit' value='change'>" +
                            "</td><tr>";
                }
                users+="</table>";
                req.setAttribute("users",users);
                req.getRequestDispatcher("admin.jsp").forward(req,res);
            }
        }
        catch(SQLException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
