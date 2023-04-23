package com.amontaev.employees.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Position> positionList = new ArrayList<>();
    public Department(){}
    public Department(String name){
        this.name = name;
    }
}
