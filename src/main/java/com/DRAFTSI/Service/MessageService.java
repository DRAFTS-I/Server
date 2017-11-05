package com.DRAFTSI.Service;

import com.DRAFTSI.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private SimpMessagingTemplate template;
    public void sendText(Message message){
        this.template.convertAndSend("/topic/client",message);
    }
}
