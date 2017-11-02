package com.DRAFTSI.Controller;

import com.DRAFTSI.AsyncHelper.AsyncHelper;
import com.DRAFTSI.DraftsIApplication;
import com.DRAFTSI.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


//@RestController
@Controller
public class Stream {
    @Autowired
    DraftsIApplication frame;
    @Autowired
    AsyncHelper asyncHelper;
    @Autowired
    GreetingController greetingController;

    @GetMapping(path="/view")
    String Stream(){
        return "view";
    }
    @GetMapping(path="/show")
    String Show(){
        return "index";
    }
    @PostMapping(path="/poepoe")
    String Index(@Validated Message message){
        System.out.println(message.getName());
//        System.out.println(message.getId());
        greetingController.sendtext(message);
        return "null";
    }
}
