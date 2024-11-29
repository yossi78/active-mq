package com.example.active_mq.messaging;

import com.example.active_mq.entity.UserEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private UserEntity lastReceivedUser;

    @JmsListener(destination = "userQueue")
    public void consume(UserEntity user) {
        lastReceivedUser = user;
    }

    public UserEntity getLastReceivedUser() {
        UserEntity user = lastReceivedUser;
        lastReceivedUser = null; // Clear the last received user after consuming
        return user;
    }
}
