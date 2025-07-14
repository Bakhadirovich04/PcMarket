package uz.husan.pcmarket.entity;

import jakarta.persistence.*;

@Entity
public class ProductParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private Product product;
    @ManyToOne
    private ParamValue paramValue;
}

