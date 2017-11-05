package com.DRAFTSI.Controller;

import com.DRAFTSI.Service.DamageService;
import com.DRAFTSI.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DamageController {
    @Autowired
    DamageService damageService;
    @RequestMapping(value="/damage",method= RequestMethod.POST)
    String Damage(@Validated Message message, Model model){
        return damageService.getInterim(message.getId()).toString();
    }
}
