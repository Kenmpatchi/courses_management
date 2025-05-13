package com.example.courses_management.model;

public class course {
    private String Name;
    private String title;
    private String description;
    private String main_content;
    private int course_id;
    private int group_id;
    public course(String Name,String title,String description,String main_content){
        this.Name=Name;
        this.title=title;
        this.description=description;
        this.main_content=main_content;
    }
    public course(int course_id,String Name,String title,String description,String main_content,int group_id){
        this.course_id=course_id;
        this.group_id=group_id;
        this.Name=Name;
        this.title=title;
        this.description=description;
        this.main_content=main_content;
    }

    public int getGroup_id() {
        return group_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain_content() {
        return main_content;
    }

    public void setMain_content(String main_content) {
        this.main_content = main_content;
    }

    public String tostring() {
        return course_id+" name "+Name+" title "+title;
    }
}
