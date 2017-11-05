package com.DRAFTSI.Repository;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class DamageRepository {
    private static Date date;
    public DamageRepository(){
        this.date=new Date();
    }
    public void updateDate(){
        this.date = new Date();
    }
    public Long getInterim(){
        return new Date().getTime()-this.date.getTime();
    }
}
