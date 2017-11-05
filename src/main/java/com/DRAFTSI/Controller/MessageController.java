package com.DRAFTSI.Controller;

import com.DRAFTSI.Model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @MessageMapping("/server") // エンドポイントの指定
    @SendTo("/topic/client") // メッセージの宛先を指定
    public Message greeting(Message message) {
        return message;
    }
}
