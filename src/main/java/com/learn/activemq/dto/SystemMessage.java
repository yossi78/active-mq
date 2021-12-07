package com.learn.activemq.dto;
import lombok.Data;
import java.io.Serializable;


@Data
public class SystemMessage implements Serializable{

    private String source;
    private String message;


    @Override
    public String toString() {
        return "{system_message__source="+source + "___message="+message+"}";
    }


}
