package com.blueparking.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ParkingLocalBatchApplication {

    public static void main(String[] args) {
        SpringApplication
                .run(ParkingLocalBatchApplication.class, args);
    }

}
