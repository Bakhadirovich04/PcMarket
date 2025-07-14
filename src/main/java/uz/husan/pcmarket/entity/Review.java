package uz.husan.pcmarket.entity;

import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne

    private User user;

    @ManyToOne
    private Product product;
}
