package com.DRAFTSI.Repository;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TimerRepository {
    private static Date time;
    private static boolean isEnable;
    public void init(){
        time=new Date();
        isEnable=false;
    }
    public void flag(boolean isEnable){
        this.isEnable=isEnable;
    }
    public Long getTime(){
        if(isEnable) {
            return new Date().getTime() - this.time.getTime();
        }else{
            return new Long(0);
        }
    }
}
