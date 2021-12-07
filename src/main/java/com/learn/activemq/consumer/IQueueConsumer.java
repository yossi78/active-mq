package com.learn.activemq.consumer;
import com.learn.activemq.dto.NotificationMessage;


public interface IQueueConsumer {

    public void messageListener(NotificationMessage message);

}
