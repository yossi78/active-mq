package com.learn.activemq.consumer;
import com.learn.activemq.model.Messagable;
import com.learn.activemq.model.old.OLD_BaseMessage;



public interface IQueueConsumer {

    public void messageListener(Messagable message);

}
