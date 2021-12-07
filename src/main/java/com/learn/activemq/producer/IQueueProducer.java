package com.learn.activemq.producer;
import com.learn.activemq.dto.SystemMessage;



public interface IQueueProducer {

    public void publishMessage(SystemMessage systemMessage);

}
