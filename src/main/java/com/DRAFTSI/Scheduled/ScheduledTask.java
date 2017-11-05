package com.DRAFTSI.Scheduled;

import com.DRAFTSI.Model.Message;
import com.DRAFTSI.Repository.TimerRepository;
import com.DRAFTSI.Service.MessageService;
import com.DRAFTSI.Service.TimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    @Autowired
    MessageService messageService;
    @Autowired
    TimerService timerService;
    @Scheduled(initialDelay=0,fixedRate=1000)
    public void sheduledTime(){
        Message message=new Message();
        message.setType("time");
        message.setValue(timerService.getTime().toString());
        messageService.sendText(message);
    }
}
