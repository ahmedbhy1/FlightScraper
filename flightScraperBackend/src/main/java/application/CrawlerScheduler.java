package application;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
@EnableConfigurationProperties
public class CrawlerScheduler {

    @Scheduled(fixedRate = 30000)
    public void scheduleFixedRateTask() {
        System.out.println("-----------the Scheduler Works---------");
    }
}
