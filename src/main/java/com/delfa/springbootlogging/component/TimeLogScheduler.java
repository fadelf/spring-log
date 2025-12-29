package com.delfa.springbootlogging.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeLogScheduler {

    private static final Logger log =
            LoggerFactory.getLogger(TimeLogScheduler.class);

    @Scheduled(fixedRate = 60_000) // every one minute
    public void logCurrentTime() {
        log.info("Current time is {}", LocalDateTime.now());
    }
}
