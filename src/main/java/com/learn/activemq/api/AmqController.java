package com.learn.activemq.api;
import com.learn.activemq.model.MsTemplateMessage;
import com.learn.activemq.producer.AmqProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/amq")
@Slf4j
public class AmqController {


    private AmqProducer amqProducer;

    public AmqController(AmqProducer amqProducer){
        this.amqProducer=amqProducer;
    }


    @PostMapping("/publishMessage")
    public ResponseEntity<String> publishMessage(@RequestBody MsTemplateMessage msTemplateMessage){
        try{
            amqProducer.publishMessage(msTemplateMessage);
        }catch (Exception e){
            log.error("Failed to publish message: "+ msTemplateMessage);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Sent",HttpStatus.OK);
    }


}
