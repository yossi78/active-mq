package com.learn.activemq.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import javax.jms.ConnectionFactory;


@Configuration
@EnableJms
public class JmsConfig {


    @Value("${spring.activemq.concurrency}")
    private String concurrency;


    @Bean
    public DefaultJmsListenerContainerFactory  jmsListenerContainerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory=new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setConcurrency(concurrency);
        return jmsListenerContainerFactory;
    }



}

