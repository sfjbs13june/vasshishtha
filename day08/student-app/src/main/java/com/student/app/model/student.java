package com.student.app.model;

public class student {
    String name;
    String sch_name;
    int roll_num;
    int std;

    public student(String name, String sch_name, int roll_num, int std) {
        this.name = name;
        this.sch_name = sch_name;
        this.roll_num = roll_num;
        this.std = std;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSch_name() {
        return sch_name;
    }

    public void setSch_name(String sch_name) {
        this.sch_name = sch_name;
    }

    public int getRoll_num() {
        return roll_num;
    }

    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }
}
