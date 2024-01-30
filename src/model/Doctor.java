package model;

import java.util.List;

public class Doctor {
    public String docId;
    String name;
    String degree;
    String speciality;
    int salary;
    long phone;
    List<Patient> list;
    String timeSlot;

    @Override
    public String toString() {
        return "Doctor{" +
                "docId='" + docId + '\'' +
                ", name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                ", speciality='" + speciality + '\'' +
                ", salary=" + salary +
                ", phone=" + phone +
                ", list=" + list +
                ", timeSlot='" + timeSlot + '\'' +
                '}';
    }

    public Doctor(String docId, String name, String degree, String speciality, int salary, long phone, List<Patient> list, String timeSlot) {
        this.docId = docId;
        this.name = name;
        this.degree = degree;
        this.speciality = speciality;
        this.salary = salary;
        this.phone = phone;
        this.list = list;
        this.timeSlot = timeSlot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public List<Patient> getList() {
        return list;
    }

    public void setList(List<Patient> list) {
        this.list = list;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}
