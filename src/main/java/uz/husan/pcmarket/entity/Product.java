package uz.husan.pcmarket.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Integer count;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<ProductParam> params = new ArrayList<>();
}
