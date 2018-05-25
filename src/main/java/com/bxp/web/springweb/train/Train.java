package com.bxp.web.springweb.train;

/**
 * @Author: bbp(xiuping bao) on 2018/5/24.
 * @Date: 2018/5/24 9:32
 */
public class Train {
    private int ID;
    private String orgin;
    private String terminal;
    private String intermediate;
    private String distance;
    private String ticket;
    private String date;
    private String number;
    private String time;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getIntermediate() {
        return intermediate;
    }

    public void setIntermediate(String intermediate) {
        this.intermediate = intermediate;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
