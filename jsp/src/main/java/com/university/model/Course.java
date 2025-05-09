package com.university.model;

public class Course {
    private String id;
    private String name;
    private String instructor;
    private int credits;

    public Course(String id, String name, String instructor, int credits) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getInstructor() { return instructor; }
    public int getCredits() { return credits; }
}