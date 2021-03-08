package com.gmail.alevidalperez88.BuilderDesing.Builder;

import java.util.Date;

public class BuilderHomework {

    private final long id;
    private String homework = "";
    private String description = "";
    private String teacher = "";
    private String student = "";
    private boolean done = false;
    private Date timeLimit = new Date();

    public BuilderHomework(long id) {
        this.id = id;
    }


    public BuilderHomework setHomework(String homework) {
        this.homework = homework;
        return this;
    }

    public BuilderHomework setDescription(String description) {
        this.description = description;
        return this;
    }

    public BuilderHomework setTeacher(String teacher) {
        this.teacher = teacher;
        return this;
    }

    public BuilderHomework setStudent(String student) {
        this.student = student;
        return this;
    }

    public BuilderHomework setDone(boolean done) {
        this.done = done;
        return this;
    }

    public BuilderHomework setTimeLimit(Date timeLimit) {
        this.timeLimit = timeLimit;
        return this;
    }

    public Homework build(){
        return new Homework(id, homework, description, teacher, student, done, timeLimit);
    }


}
