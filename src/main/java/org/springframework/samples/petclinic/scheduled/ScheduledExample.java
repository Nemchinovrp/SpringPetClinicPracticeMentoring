package org.springframework.samples.petclinic.scheduled;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

//@Component
public class ScheduledExample {
    /**
     * Fixed Delay scheduler is used to execute the tasks at a specific time.
     * It should wait for the previous task completion.
     * The values should be in milliseconds.
     */
    @Scheduled(fixedDelay = 5000)
    public void fixedDelayDemo() {
        System.out.println("Method fixedDelayDemo() executed at every 5 seconds. Current time is :: " + new Date());
    }

    /**
     * Fixed Rate scheduler is used to execute the tasks at the specific time.
     * It does not wait for the completion of previous task.
     * The values should be in milliseconds
     */
    @Scheduled(fixedRate = 5000)
    public void fixedRateDemo() {
        System.out.println("Method fixedRateDemo() executed at every 5 seconds. Current time is :: " + new Date());

    }

    @Scheduled(cron = "*/5 * * * * ?")
    public void demoCronTimerDemo() {
        System.out.println("Method demoCronTimerDemo() executed at every 5 seconds. Current time is :: " + new Date());
    }
}
