package com.example.pm.service;

import com.example.pm.model.Message;
import com.example.pm.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    //查询所有消息
    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    // 按照时间倒序查看消息
    public List<Message> getMessagesByTimeDesc() {
        return messageRepository.findAllByOrderByCreatedAtDesc();
    }

    // 按照订阅栏目查看消息
    public List<Message> getMessagesBySubscription(String subscription) {
        // 通过订阅栏目名称来查询
        return messageRepository.findBySubscription(subscription);
    }

    // 支持分页显示消息
    public Page<Message> getMessagesPaged(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by("createdAt").descending());
        return messageRepository.findAll(pageable);
    }
}
