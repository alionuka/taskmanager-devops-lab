package com.example.notificationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    @GetMapping("/notifications")
    public List<String> getNotifications() {
        return List.of(
                "Task created",
                "Task deleted"
        );
    }
}