package UtilityClasses;

public class Student {
    private String name;
    private String grade; // e.g., "A", "B", "C"

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    // toString() for printing
    @Override
    public String toString() {
        return name + " (" + grade + ")";
    }
}
