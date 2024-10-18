package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemoryHogController {

    private final List<byte[]> memoryHog = new ArrayList<>();

    // http://localhost:8080/consume-memory
    @GetMapping("/consume-memory")
    public String consumeMemory() {
        // Allocate 50 MB of memory each time the endpoint is called
        memoryHog.add(new byte[50 * 1024 * 1024]);
        return "Allocated 50 MB of memory! Current list size: " + memoryHog.size();
    }

    // http://localhost:8080/test
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}

