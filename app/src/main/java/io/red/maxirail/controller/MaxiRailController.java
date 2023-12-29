package io.red.maxirail.controller;

import io.red.maxirail.model.TrainTime;
import io.red.maxirail.service.TimeTrainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaxiRailController {
    private final TimeTrainService timeTrainService;

    public MaxiRailController(TimeTrainService timeTrainService) {
        this.timeTrainService = timeTrainService;
    }

    @GetMapping("/")
    public List<TrainTime> index() {
        return timeTrainService.getTrainTimes();
    }
}
