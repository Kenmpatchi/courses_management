package com.example.courses_management.controllers;

import com.example.courses_management.connection.DBconnection;
import com.example.courses_management.model.course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ccourses {
    DBconnection db=new DBconnection();
    private Connection conn=null;
    private Statement st=db.getSt();
    private ResultSet rs=db.getRs();

    public Ccourses() throws ClassNotFoundException, SQLException {
        db.connect();
        conn=db.getConn();
    }
    public void insert(course c)throws SQLException {
        st=conn.createStatement();
        st.executeUpdate("insert into course(name,title,description,main_content)values('"+c.getName()+"','"+c.getTitle()+ "','"+c.getDescription()+"','"+c.getMain_content()+"')");
    }
    public List<course> selectAll()throws SQLException{
        st=conn.createStatement();
        rs=st.executeQuery("select * from course");
        List<course> courses=new ArrayList<>();
        while (rs.next()){
            courses.add(new course( rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)));
        }
        return courses;
    }
    public course selectbyid(int id)throws SQLException{
        st=conn.createStatement();
        rs=st.executeQuery("select * from course where course_id='"+id+"'");
        rs.next();
        course data=new course( rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
        return data;
    }
    public void delete(int id)throws SQLException{
        st=conn.createStatement();
        st.executeUpdate("delete from course where course_id='"+id+"'");
    }
    public void update(course c,int id)throws SQLException{
        st=conn.createStatement();
        st.executeUpdate("UPDATE course SET name='"+c.getName()+"', title='"+c.getTitle()+"', description='"+c.getDescription()+"', main_content='"+c.getMain_content()+"' WHERE course_id='"+id+"';");
    }
}
