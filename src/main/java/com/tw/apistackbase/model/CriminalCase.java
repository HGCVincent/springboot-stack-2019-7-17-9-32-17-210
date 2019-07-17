package com.tw.apistackbase.model;


import javax.persistence.*;

@Entity
@Table(name = "criminal_case")
public class CriminalCase {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 255,nullable = false)
    private String casename;
    private long time;

    public CriminalCase() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
