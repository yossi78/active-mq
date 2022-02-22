package com.learn.activemq.model.old;
import java.io.Serializable;




public class MsTemplateMessageOLD extends OLD_BaseMessage implements Serializable {


    public MsTemplateMessageOLD(String operation, String message) {
        super(operation,message);
    }


}