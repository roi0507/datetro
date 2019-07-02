package com.datetro.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Matcher {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;

    public String name;


}
