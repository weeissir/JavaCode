package com.example.pm.controller;

import com.example.pm.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class TestController {
    private final NotificationService notificationService;

    @Autowired
    public TestController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/test/sendNotification")
    public String sendNotification(@RequestBody NotificationRequest request) {
        String title = request.getTitle();
        String content = request.getContent();
        Long[] userIds = request.getUserIds();

        notificationService.sendNotification(title, content, Arrays.asList(userIds));

        return "Notification sent successfully!";
    }


    static class NotificationRequest {
        private String title;
        private String content;
        private Long[] userIds;


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Long[] getUserIds() {
            return userIds;
        }

        public void setUserIds(Long[] userIds) {
            this.userIds = userIds;
        }
    }
}
