package com.example.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class EventService {
    private final NotificationService notificationService;

    @Autowired
    public EventService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void handleSystemEvent(String eventName, String eventDetails, Long userId) {
        // 处理系统事件逻辑
        // 例如：根据事件名称和详情进行具体处理

        // 发送通知消息
        String title = "System Event: " + eventName;
        String content = "Details: " + eventDetails;
        notificationService.sendNotification(title, content, Collections.singletonList(userId));
    }
}
