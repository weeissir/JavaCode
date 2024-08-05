package com.example.pm.repository;

import com.example.pm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query("SELECT u.email FROM User u WHERE u.id IN :userIds")
    List<String> findEmailsByUserIds(List<Long> userIds);
}
