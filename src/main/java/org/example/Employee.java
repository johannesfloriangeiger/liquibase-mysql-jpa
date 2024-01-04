package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
public class Employee {

    @Id
    private Integer id;

    private String name;

    public Employee(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }
}