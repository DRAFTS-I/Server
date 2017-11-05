package com.DRAFTSI.Controller;

import com.DRAFTSI.Service.TimerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimerController {
    @Autowired
    TimerService timerService;

    @PostMapping(path = "/startTimer")
    String startTimer(){
        timerService.startTimer();
        return "success";
    }
    @PostMapping(path="/endTimer")
    String endTimer(){
        timerService.endTimer();
        return "success";
    }

}
