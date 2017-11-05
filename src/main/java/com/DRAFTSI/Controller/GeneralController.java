package com.DRAFTSI.Controller;

import com.DRAFTSI.Model.Message;
import com.DRAFTSI.Service.DamageService;
import com.DRAFTSI.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class GeneralController {
    @Autowired
    DamageService damageService;
    @Autowired
    MessageService messageService;

    @GetMapping(path="/view")
    String stream(){
        return "view";
    }
    @GetMapping(path="/show")
    String show(){
        return "index";
    }
    @PostMapping(path="/message")
    String getMessage(@Validated Message message){
        System.out.println("from : "+message.getId()+" type : "+message.getType()+" value : "+message.getValue());
        if(message.getType().equals("damage")){
            damageService.update(message.getId());
        }
        messageService.sendText(message);
        return "dummy";
    }
    @GetMapping(path = "/admin")
    String admin(){
        return "admin";
    }
    @GetMapping(path="/lite")
    String lite(){
        return "lite";
    }
    @GetMapping(path="/admin/lite")
    String adminLite(){
        return "admin_lite";
    }
}
