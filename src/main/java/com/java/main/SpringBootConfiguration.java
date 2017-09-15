package com.java.main;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAsync
@EnableScheduling
public class SpringBootConfiguration {
	
	@Bean
    public Executor getTaskExecutor() {
		System.out.println("-----------inside executor");
        return Executors.newScheduledThreadPool(10);
    }

}
