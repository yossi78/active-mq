package com.learn.activemq.producer;
import com.learn.activemq.model.MsTemplateMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;



@Slf4j
@Service
public class AmqProducer implements IQueueProducer{


    @Value("${spring.activemq.queue.name}")
    private String queueName;

    private JmsTemplate jmsTemplate;

    @Autowired
    public AmqProducer(@Qualifier("activeMqJmsTemplate") JmsTemplate jmsTemplate){
        this.jmsTemplate=jmsTemplate;
    }


    @Override
    public void publishMessage(MsTemplateMessage msTemplateMessage) {
        log.info("PUBLISH_MESSAGE="+ msTemplateMessage.toString());
        jmsTemplate.convertAndSend(queueName, msTemplateMessage);
    }


}


