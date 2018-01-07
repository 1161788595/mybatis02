package com.zking.po;

import java.util.List;

public class Uservo extends  User{
private int start;
private int end;
private String value;
private List<User> ids;


    public List<User> getIds() {
        return ids;
    }

    public void setIds(List<User> ids) {
        this.ids = ids;
    }

    public Uservo(int start, int end, String value) {
        this.start = start;
        this.end = end;
        this.value = value;
    }

    public Uservo() {
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
