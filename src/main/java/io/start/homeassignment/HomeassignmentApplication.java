package io.start.homeassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("io.start.homeassignment.persistent.entity")
public class HomeassignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeassignmentApplication.class, args);
    }

}
