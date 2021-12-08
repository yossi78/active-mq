package com.learn.activemq.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;



@Data
@AllArgsConstructor
public abstract class BaseMessage implements Serializable {

    protected String source;
    protected String message;


}
