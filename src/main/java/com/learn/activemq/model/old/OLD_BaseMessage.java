package com.learn.activemq.model.old;
import lombok.*;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class OLD_BaseMessage implements IMsTemplateMessage, Serializable {

    protected String operation;
    protected String message;


}