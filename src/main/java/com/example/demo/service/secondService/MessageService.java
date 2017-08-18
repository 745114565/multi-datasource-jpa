package com.example.demo.service.secondService;

import com.example.demo.domain.secondDomain.Message;

/**
 * sun on 2017/6/22.
 */
public interface MessageService {

    Message addMessage(Message message);

    Message findOneById(Long id);

    Message updateMessage(Message message);

    void deleteMessage(Message message);

}
