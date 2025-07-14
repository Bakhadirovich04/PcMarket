package uz.husan.pcmarket.entity;

import jakarta.persistence.*;

@Entity
public class Parametr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Category category;
}
