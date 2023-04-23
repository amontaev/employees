package com.amontaev.employees.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Position {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    private Department department;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employeeList = new ArrayList<>();
}
