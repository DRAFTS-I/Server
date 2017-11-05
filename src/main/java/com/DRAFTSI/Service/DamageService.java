package com.DRAFTSI.Service;

import com.DRAFTSI.Repository.DamageRepository;
import org.springframework.stereotype.Service;

@Service
public class DamageService {
    private static DamageRepository rightDamage;
    private static DamageRepository leftDamage;
    public DamageService(){
        rightDamage=new DamageRepository();
        leftDamage=new DamageRepository();
    }
    public void update(String dir){
        if (dir.equals("right")) {
            rightDamage.updateDate();
        }else if(dir.equals("left")){
            leftDamage.updateDate();
        }
    }
    public Long getInterim(String dir){
        if(dir.equals("right")){
            return rightDamage.getInterim();
        }else if(dir.equals("left")){
            return leftDamage.getInterim();
        }
        return null;
    }
}
