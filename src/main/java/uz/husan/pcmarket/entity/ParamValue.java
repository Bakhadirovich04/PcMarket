package uz.husan.pcmarket.entity;

import jakarta.persistence.*;

@Entity
public class ParamValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @ManyToOne
    private Parametr parametr;
}
