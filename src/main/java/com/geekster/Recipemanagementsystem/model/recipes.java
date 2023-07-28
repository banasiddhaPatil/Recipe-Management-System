package com.geekster.Recipemanagementsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="recipes")

public class recipes {
    @Id
    private Integer Id;
    private String name;
    private String ingredients;
    private String instructions;
}
