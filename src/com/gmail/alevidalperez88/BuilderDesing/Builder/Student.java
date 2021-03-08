package com.gmail.alevidalperez88.BuilderDesing.Builder;

import java.util.Date;

public class Student {

    public static void main(String[] args){
        Homework homework = new BuilderHomework(2)
                .setHomework("Exercises Math 30-40")
                .setDescription("Do math exercises")
                .setTeacher("Juan Pérez")
                .setStudent("Alejandro Vidal")
                .setTimeLimit(new Date())
                .setDone(false)
                .build();

        System.out.println(homework);
    }

}
