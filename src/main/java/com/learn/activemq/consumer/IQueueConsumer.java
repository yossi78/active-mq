package com.learn.activemq.consumer;
import com.learn.activemq.model.BaseMessage;



public interface IQueueConsumer {

    public void messageListener(BaseMessage baseMessage);

}
