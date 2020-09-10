package ru.gpbtask.gpx.hackgpxpush;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HackGpxPushApplication {

    public static void main(String[] args) {
        SpringApplication.run(HackGpxPushApplication.class, args);
    }

}
