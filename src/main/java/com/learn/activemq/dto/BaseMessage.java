package com.learn.activemq.dto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
public abstract class BaseMessage implements Serializable {

    protected String source;
    protected String message;


    public BaseMessage(String source,String message){
        this.source=source;
        this.message=message;
    }

}
