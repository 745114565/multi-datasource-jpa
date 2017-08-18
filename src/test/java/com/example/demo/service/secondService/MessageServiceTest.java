package com.example.demo.service.secondService;

import com.example.demo.domain.secondDomain.Message;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * sun on 2017/6/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void addMessage() throws Exception {
        Message message = messageService.addMessage(new Message("M01","我的第一个消息"));
        Assert.assertEquals("M01",message.getName());
        Assert.assertEquals("我的第一个消息",message.getContent());
    }
}