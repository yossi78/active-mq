package com.example.active_mq.service;
import com.example.active_mq.entity.UserEntity;
import com.example.active_mq.messaging.MessageConsumer;
import com.example.active_mq.messaging.MessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private MessagePublisher publisher;

    @Autowired
    private MessageConsumer consumer;

    public void addUser(UserEntity user) {
        publisher.publish(user);
    }

    public UserEntity consumeUser() {
        return consumer.getLastReceivedUser();
    }
}
