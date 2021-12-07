package com.learn.activemq.consumer;
import com.learn.activemq.dto.NotificationMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;



@Slf4j
@Component
public class AmqConsumer implements IQueueConsumer{



    @Override
    @JmsListener(destination = "${spring.activemq.queue.name}")
    public void messageListener(NotificationMessage message) {
        log.info("CONSUME_MESSAGE="+message.toString());
    }

}

