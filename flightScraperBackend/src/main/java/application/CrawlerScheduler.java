package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
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
        System.out.println("-----------Lets add feature 1---------");
    }
}
