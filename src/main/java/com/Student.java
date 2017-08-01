package com;

public class Student {
    private String firstName;
    private String lastName;
    private Grade grade;
    private boolean enrolled = true;

    public Student(String firstName, String lastName, Grade grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Grade getGrade() {
        return grade;
    }

    void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isEnrolled() {
        return enrolled;
    }
}
