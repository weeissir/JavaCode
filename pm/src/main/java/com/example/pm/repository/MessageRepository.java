package com.example.pm.repository;

import com.example.pm.model.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{

    //按照时间倒序
    List<Message> findAllByOrderByCreatedAtDesc();

    //按照订阅栏目
    List<Message> findBySubscription(String subscription);

    //分页
    Page<Message> findAll(Pageable pageable);
}
