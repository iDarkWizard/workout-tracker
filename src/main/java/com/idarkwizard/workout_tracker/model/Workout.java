package com.idarkwizard.workout_tracker.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    public Workout(String workoutName) {
        this.workoutName = workoutName;
        this.id = 10;
        this.exercises = new ArrayList<>();
        this.exercises.add("Ejercicio 1");
        this.exercises.add("Ejercicio 2");
        this.localDate = LocalDate.now();
    }

    private String workoutName;
    private Integer id;
    private List<String> exercises;
    private LocalDate localDate;

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getExercises() {
        return exercises;
    }

    public void setExercises(List<String> exercises) {
        this.exercises = exercises;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
