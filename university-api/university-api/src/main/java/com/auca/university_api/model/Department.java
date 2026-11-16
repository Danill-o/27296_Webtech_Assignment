package com.auca.university_api.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    @Column(nullable = false, unique = true, length = 100)
    private String departmentName;

    @Column(length = 500)
    private String description;

    // A department employs many lecturers.
    @OneToMany(mappedBy = "department")
    private List<Lecturer> lecturers = new ArrayList<>();

    // Each department has one head lecturer. A lecturer can head at most one department.
    @OneToOne
    @JoinColumn(name = "head_lecturer_id", unique = true)
    private Lecturer headLecturer;

    // One department offers many courses.
    @OneToMany(mappedBy = "department")
    private List<Course> courses = new ArrayList<>();

    // Many students are assigned to one department.
    @OneToMany(mappedBy = "department")
    private List<Student> students = new ArrayList<>();

    public Department() {}

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public Lecturer getHeadLecturer() {
        return headLecturer;
    }

    public void setHeadLecturer(Lecturer headLecturer) {
        this.headLecturer = headLecturer;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
