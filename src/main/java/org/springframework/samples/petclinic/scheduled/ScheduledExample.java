package org.springframework.samples.petclinic.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledExample {
    @Scheduled(fixedDelay = 5000)
    public void fixedDelayDemo() {
        System.out.println("Method fixedDelayDemo() executed at every 5 seconds. Current time is :: " + new Date());
    }

    @Scheduled(fixedRate = 5000)
    public void fixedRateDemo() {
        System.out.println("Method fixedRateDemo() executed at every 5 seconds. Current time is :: " + new Date());

    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void demoCronTimerDemo() {
        System.out.println("Method demoCronTimerDemo() executed at every 5 seconds. Current time is :: " + new Date());
    }
}
