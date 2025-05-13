package com.example.courses_management.group_servlet;

import com.example.courses_management.controllers.Cgroups;
import com.example.courses_management.model.group;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class viewGroups {
    public viewGroups(int professor_id,HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
        try{
            Cgroups Cg=new Cgroups();
            String groups="<table>";
            for(group g:Cg.selectAllbyid(professor_id)){
                groups+="<tr><td>"+g.tostring()+"</td>"+
                        "<td><form action='Groupsetting' method='post'><input type='hidden' name='professor_id' value="+g.getProfessor_id()+"><input type='hidden' name='group_id' value="+g.getGroup_id()+"><input type='submit' value='delete'></form></td>" +
                        "<td><a href='Pupdate_groups.jsp?professor_id="+g.getProfessor_id()+"&group_id="+g.getGroup_id()+"'>update</a>" +
                        "</td><td><form action='view' method='get'><input type='hidden' name='group_id' value="+g.getGroup_id()+"><input type='submit' value='view'></form>" +
                        "</td></tr>";
            }
            groups+="</table>";
            req.setAttribute("groups",groups);
            req.setAttribute("professor_id",professor_id);
            req.getRequestDispatcher("Pview_groups.jsp").forward(req,res);
    }
        catch (SQLException|ClassNotFoundException e){
        throw new RuntimeException(e);
    }
    }
}
