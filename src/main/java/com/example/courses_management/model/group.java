package com.example.courses_management.model;

public class group {
    private int group_id;
    private String name;
    private String theme;
    private int professor_id;

    public group(int professor_id,String name,String theme){
        this.name=name;
        this.theme=theme;
        this.professor_id=professor_id;
    }
    public group(int group_id,int professor_id,String name,String theme){
        this.group_id=group_id;
        this.professor_id=professor_id;
        this.name=name;
        this.theme=theme;
    }

    public int getGroup_id() {
        return group_id;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public String getNamegroup() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public void setNamegroup(String name) {
        this.name = name;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public String tostring(){
        return "group "+name+" theme "+theme;
    }
}
