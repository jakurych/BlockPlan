package com.jakurych.blockplan.blockplan.controller;

import com.jakurych.blockplan.blockplan.model.domain.Notification;
import com.jakurych.blockplan.blockplan.service.NotificationService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/notification", produces = MediaType.APPLICATION_JSON_VALUE)
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Notification> create(@RequestBody Notification notification) {
        return ResponseEntity.ok(notificationService.createOrUpdate(notification));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Notification> delete(@PathVariable int id) {
        return ResponseEntity.ok(notificationService.delete(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> find(@PathVariable int id) {
        return ResponseEntity.ok(notificationService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Notification>> findAll() {
        return ResponseEntity.ok(notificationService.findAll());
    }
}
