package com.efr.employee.rest.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "login_phone")

    private String login_phone;
    @Column(name = "name")
    private String name;
    @Column(name = "otchestvo")
    private String otchestvo;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "sector")
    private String sector;
    @Column(name = "work_center")
    private String work_center;
    @Column(name = "job_title")
    private String job_title;

    public Employee() {
    }

    public Employee(String login_phone, String name, String otchestvo, String surname, String department, String sector, String work_center, String job_title) {
        this.login_phone = login_phone;
        this.name = name;
        this.otchestvo = otchestvo;
        this.surname = surname;
        this.department = department;
        this.sector = sector;
        this.work_center = work_center;
        this.job_title = job_title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_phone() {
        return login_phone;
    }

    public void setLogin_phone(String login_phone) {
        this.login_phone = login_phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getWork_center() {
        return work_center;
    }

    public void setWork_center(String work_center) {
        this.work_center = work_center;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
}
