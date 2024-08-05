package com.example.pm.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailNotificationService {

    @Autowired
    private final JavaMailSender javaMailSender;

    @Autowired
    public EmailNotificationService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmailNotification(String subject, String content, List<String> recipientEmails) {
        for (String recipientEmail : recipientEmails) {
            try {
                MimeMessage message = javaMailSender.createMimeMessage();
                MimeMessageHelper helper = new MimeMessageHelper(message, true);
                helper.setTo(recipientEmail);
                helper.setSubject(subject);
                helper.setText(content, true);

                javaMailSender.send(message);
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }
}
