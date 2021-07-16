package com.blueparking.batch.domain.schedule;

import com.blueparking.batch.domain.common.util.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SyncScheduleTask {

    @Scheduled(fixedDelay = (1000*60))
    public void InSync(){

        log.info("InSync start = {}", DateUtils.currentDate(""));

    }

}
