package com.gmail.alevidalperez88.BuilderDesing.Builder;

import java.util.Date;

public class Homework {

    private final long id;
    private String homework = "";
    private String description = "";
    private String teacher = "";
    private String student = "";
    private boolean done = false;
    private Date timeLimit = new Date();

    Homework(long id, String homework, String description, String teacher, String student, boolean done, Date timeLimit){
        super();
        this.id = id;
        this.homework = homework;
        this.description = description;
        this.teacher = teacher;
        this.student = student;
        this.done = done;
        this.timeLimit = timeLimit;
    }


    public long getId() {
        return id;
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(Date timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return "Homework [id= " + id +
        ", homework= " + homework +
        ", description= " + description +
        ", teacher= " + teacher +
        ", student= " + student +
        ", done= " + done +
        ", timeLimit= " + timeLimit + "]";
    }

    public static class BuilderHomework {
        private final long id;
        private String homework = "";
        private String description = "";
        private String teacher = "";
        private String student = "";
        private boolean done = false;
        private Date timeLimit = new Date();

        public void setHomework(String homework) {
            this.homework = homework;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }

        public void setStudent(String student) {
            this.student = student;
        }

        public void setDone(boolean done) {
            this.done = done;
        }

        public void setTimeLimit(Date timeLimit) {
            this.timeLimit = timeLimit;
        }

        public BuilderHomework(long id) {
            this.id = id;
        }

        public Homework build(){
            return new Homework(id, homework, description, teacher, student, done, timeLimit);
        }


    }

}
