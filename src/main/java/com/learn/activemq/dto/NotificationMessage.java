package com.learn.activemq.dto;
import lombok.Data;
import java.io.Serializable;


@Data
public class NotificationMessage implements Serializable{

    private String source;
    private String message;


    @Override
    public String toString() {
        return "{notification_message__source="+source + "___message="+message+"}";
    }


}
