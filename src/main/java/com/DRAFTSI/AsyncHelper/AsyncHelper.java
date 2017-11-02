package com.DRAFTSI.AsyncHelper;

import com.DRAFTSI.DraftsIApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.io.IOException;



@Component
public class AsyncHelper {
    @Autowired
    DraftsIApplication frame;

    @Async
    public void pushFrame(ResponseBodyEmitter emitter,Model model) throws IOException {
        for(int i=0;i<1;i++) {
            emitter.send(frame.image.toString());
            System.out.println("UpdateImage");
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                break;
            }
        }
        emitter.complete();
        System.out.println("FinishPushFrame");
    }
}
