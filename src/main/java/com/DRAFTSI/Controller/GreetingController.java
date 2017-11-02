package com.DRAFTSI.Controller;

import com.DRAFTSI.Model.Greeting;
import com.DRAFTSI.Model.Message;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    @Autowired
    private SimpMessagingTemplate template;

    static Message message_;

    @MessageMapping("/hello") // エンドポイントの指定
    @SendTo("/topic/greetings") // メッセージの宛先を指定
    public Greeting greeting(Message message) {
        return new Greeting( message.getName());
    }
    public void sendtext(Message message){
        this.template.convertAndSend("/topic/greetings",new Greeting(message.getName()));
    }
}
