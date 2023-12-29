package io.red.maxirail.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTimeServiceTest {
    @Test
    public void swapsDestinationStationToUppercase() {
        TimeTrainService trainTimeService = new TimeTrainService();
        assertEquals("BRIGHTON", trainTimeService.getTrainTimes().get(0).destinationStation());
        assertEquals("BRIGHTON", trainTimeService.getTrainTimes().get(1).destinationStation());
        assertEquals("LONDON", trainTimeService.getTrainTimes().get(2).destinationStation());
        assertEquals("LONDON", trainTimeService.getTrainTimes().get(3).destinationStation());
    }
}
