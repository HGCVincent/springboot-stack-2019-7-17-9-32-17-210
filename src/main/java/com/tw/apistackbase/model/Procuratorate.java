package com.tw.apistackbase.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Procuratorate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Length(min = 0, max = 50)
    @Column(unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Prosecutor> prosecutorList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Prosecutor> getProsecutorList() {
        return prosecutorList;
    }

    public void setProsecutorList(List<Prosecutor> prosecutorList) {
        this.prosecutorList = prosecutorList;
    }
}
