package com.idarkwizard.workout_tracker.controller;

import com.idarkwizard.workout_tracker.model.Workout;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/tracker/workout")
public class WorkoutTrackerController {
    @GetMapping
    public Workout getWorkout() {
        return new Workout("Mati");
    }
}
