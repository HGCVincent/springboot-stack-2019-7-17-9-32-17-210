package com.tw.apistackbase.model;


import javax.persistence.*;

@Entity
@Table(name = "criminal_elements")
public class CriminalElements {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 255)
    private String ObjectiveElement;

    @Column(length = 255,nullable = false)
    private String subjectiveElement;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjectiveElement() {
        return ObjectiveElement;
    }

    public void setObjectiveElement(String objectiveElement) {
        ObjectiveElement = objectiveElement;
    }

    public String getSubjectiveElement() {
        return subjectiveElement;
    }

    public void setSubjectiveElement(String subjectiveElement) {
        this.subjectiveElement = subjectiveElement;
    }

}
