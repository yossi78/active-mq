package com.learn.activemq.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



public class NotificationMessage extends BaseMessage implements Serializable{



    public NotificationMessage(String source,String message){
        super(source, message);
    }

//    @Override
//    public String toString() {
//        return "{notification_message__source="+source + "___message="+message+"}";
//    }


}
