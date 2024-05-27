package com.example.FirstSpringJPAProject.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Baller")
public class Baller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private byte jerseyNumber;
    private String name;
    private String nationality;
}
