package com.learn.activemq.producer;
import com.learn.activemq.model.Messagable;




public interface IQueueProducer {

    public void publishMessage(Messagable message);

}
