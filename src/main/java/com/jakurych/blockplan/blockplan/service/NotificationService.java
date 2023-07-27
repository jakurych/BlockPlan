package com.jakurych.blockplan.blockplan.service;

import com.jakurych.blockplan.blockplan.model.domain.Notification;
import com.jakurych.blockplan.blockplan.model.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification createOrUpdate(Notification notification) {
        notificationRepository.save(notification);
        return notification;
    }

    public Notification delete(int id) {
        Notification notification = findById(id);
        notificationRepository.delete(notification);
        return notification;
    }

    public Notification findById(int id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public List<Notification> findAll() {
        return notificationRepository.findAll();
    }
}
