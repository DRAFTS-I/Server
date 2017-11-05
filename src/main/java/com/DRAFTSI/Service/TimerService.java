package com.DRAFTSI.Service;

import com.DRAFTSI.Repository.TimerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimerService {
    @Autowired
    TimerRepository timerRepository;
    public TimerService(){
        timerRepository=new TimerRepository();
    }
    public void startTimer(){
        timerRepository.init();
        timerRepository.flag(true);
    }
    public void endTimer(){
        timerRepository.flag(false);
    }
    public Long getTime(){
        return timerRepository.getTime();
    }
}
