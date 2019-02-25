package com.hcy308.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;

@SpringBootApplication(exclude = JmxAutoConfiguration.class)
public class DemoLombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLombokApplication.class, args);
    }

}
