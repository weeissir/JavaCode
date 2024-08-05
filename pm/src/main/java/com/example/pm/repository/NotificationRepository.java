package com.example.pm.repository;

import com.example.pm.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserIdAndTitleAndContent(Long userId, String title, String content);
//    @Query("SELECT DISTINCT u.email FROM User u WHERE u.id IN :userIds")
    List<String> findEmailsByUserIds(List<Long> userIds);
}
