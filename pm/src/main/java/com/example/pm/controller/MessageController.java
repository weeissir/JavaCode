package com.example.pm.controller;

import com.example.pm.model.Message;
import com.example.pm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }

    //获取所有消息
    @GetMapping
    public List<Message> getAllMessage(){
        return messageService.getAllMessages();
    }

    // 按照时间倒序查看消息
    @GetMapping("/sorted")
    public List<Message> getMessagesSortedByTime() {
        return messageService.getMessagesByTimeDesc();
    }

    // 按照订阅栏目查看消息
    @GetMapping("/subscription")
    public List<Message> getMessagesBySubscription(@RequestParam("subscription") String subscription) {
        return messageService.getMessagesBySubscription(subscription);
    }

    // 分页显示消息
    @GetMapping("/paged")
    public Page<Message> getMessagesPaged(@RequestParam(value = "page", defaultValue = "0") int page,
                                          @RequestParam(value = "size", defaultValue = "10") int size) {
        return messageService.getMessagesPaged(page, size);
    }
}
