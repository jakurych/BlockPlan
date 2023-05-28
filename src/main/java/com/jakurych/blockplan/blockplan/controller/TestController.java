package com.jakurych.blockplan.blockplan.controller;
import com.jakurych.blockplan.blockplan.model.domain.Test;
import com.jakurych.blockplan.blockplan.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping
    public ResponseEntity<List<Test>> findAll() {
        return ResponseEntity.ok(testService.findAll());
    }
}
