package com.DRAFTSI.Model;

public class Message {
    private String type;
    private String id;
    private String value;
    public String getType(){
        return type;
    }
    public String getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setValue(String value) {
        this.value = value;
    }
}