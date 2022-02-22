package com.learn.activemq.model;
import java.io.Serializable;



public interface Messagable extends Serializable {

    public String toJson();

}
