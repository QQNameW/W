package com.demo.pojo;

/**
 * Created by Administrator on 2017/4/26.
 */
public class StudentBean {
    private String Id;
    private String Name;
    private String StudentClass;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String studentClass) {
        StudentClass = studentClass;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", StudentClass='" + StudentClass + '\'' +
                '}';
    }
}
