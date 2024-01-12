package com.example.jpa.demojpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPublication;

    @Column(name = "titre")
    private String titre;

    @Column(name = "auteur")
    private String auteur;

}
