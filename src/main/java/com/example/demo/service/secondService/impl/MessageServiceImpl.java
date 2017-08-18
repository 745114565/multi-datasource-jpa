package com.example.demo.service.secondService.impl;

import com.example.demo.domain.secondDomain.Message;
import com.example.demo.repository.secondRepository.MessageRepository;
import com.example.demo.service.secondService.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * sun on 2017/6/22.
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message addMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message findOneById(Long id) {
        return messageRepository.findOne(id);
    }

    @Override
    public Message updateMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Message message) {
        messageRepository.delete(message);
    }
}
