package com.learn.activemq.producer;

import com.learn.activemq.model.MsTemplateMessage;

public interface IQueueProducer {

    public void publishMessage(MsTemplateMessage msTemplateMessage);

}
