package com.amontaev.employees.core.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String lastName;
    private String firstName;
    private String Patronymic;
    @ManyToOne(cascade = CascadeType.ALL)
    private Position position;
}
