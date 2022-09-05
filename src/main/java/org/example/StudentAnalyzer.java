package org.example;

import java.util.Objects;

public class StudentAnalyzer {
    private String Name;
    private int    marks;
    private int    rollNo;

    public StudentAnalyzer(String name, int marks, int rollNo) {
        this.Name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentAnalyzer{" +
                "Name='" + Name + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentAnalyzer)) return false;
        StudentAnalyzer that = (StudentAnalyzer) o;
        return getMarks() == that.getMarks() && getRollNo() == that.getRollNo() && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMarks(), getRollNo());
    }
}
