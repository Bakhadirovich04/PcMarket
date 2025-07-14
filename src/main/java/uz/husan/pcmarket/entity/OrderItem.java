package uz.husan.pcmarket.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private Double priceAtPurchase;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Order order;
}
