package com.learn.activemq.producer;
import com.learn.activemq.dto.NotificationMessage;



public interface IQueueProducer {

    public void publishMessage(NotificationMessage notificationMessage);

}
