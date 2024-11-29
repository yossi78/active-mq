package com.example.active_mq.messaging;
import com.example.active_mq.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void publish(UserEntity user) {
        jmsTemplate.convertAndSend("userQueue", user);
    }
}
