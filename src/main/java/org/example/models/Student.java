package org.example.models;

public class Student {
    private Long id;
    private String name;
    private Class_ lophoc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class_ getLophoc() {
        return lophoc;
    }

    public void setLophoc(Class_ lophoc) {
        this.lophoc = lophoc;
    }

    public Student(Long id, String name, Class_ lophoc) {
        this.id = id;
        this.name = name;
        this.lophoc = lophoc;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lophoc=" + lophoc +
                '}';
    }
}
