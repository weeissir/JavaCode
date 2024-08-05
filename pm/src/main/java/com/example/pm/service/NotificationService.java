package com.example.pm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pm.repository.NotificationRepository;
import com.example.pm.model.Notification;
import com.example.pm.repository.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;
    private final EmailNotificationService emailNotificationService; // 使用邮件发送
    private final UserRepository userRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository,
                               EmailNotificationService emailNotificationService, UserRepository userRepository) {
        this.notificationRepository = notificationRepository;
        this.emailNotificationService = emailNotificationService;
        this.userRepository = userRepository;
    }

    public void sendNotification(String title, String content, List<Long> userIds) {
        for (Long userId : userIds) {
            Notification notification = new Notification();
            notification.setTitle(title);
            notification.setContent(content);
            notification.setCreatedAt(LocalDateTime.now());
            notification.setUserId(userId);
            notification.setDelivered(false); // 默认设置为未发送

            notificationRepository.save(notification);
            System.out.println("Saved notification for user " + userId); //添加日志
        }

        // 获取所有收件人的邮箱
        List<String> recipientEmails = userRepository.findEmailsByUserIds(userIds);
        System.out.println("Sending email notification to: " + recipientEmails);

        // 调用邮件发送服务发送邮件通知
        emailNotificationService.sendEmailNotification(title, content, recipientEmails);

        // 更新通知状态为已发送
        for (Long userId : userIds) {
            // 更新数据库中通知状态为已发送
            List<Notification> notifications = notificationRepository.findByUserIdAndTitleAndContent(userId, title, content);
            for (Notification notification : notifications) {
                notification.setDelivered(true);
                notificationRepository.save(notification);
                System.out.println("Updated notification status for user " + userId);
            }
        }
    }
}
