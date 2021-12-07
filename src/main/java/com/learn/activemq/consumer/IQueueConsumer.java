package com.learn.activemq.consumer;
import com.learn.activemq.dto.SystemMessage;


public interface IQueueConsumer {

    public void messageListener(SystemMessage message);

}
