package com.clianz.demo.async.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SomeService {

    @Async("customTaskExecutor")
    public void doSomething(String id) {
        try {
            log.info("Start sleep {}", id);
            Thread.sleep(1000);
            log.info("Finish sleep {}", id);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
    }
}
