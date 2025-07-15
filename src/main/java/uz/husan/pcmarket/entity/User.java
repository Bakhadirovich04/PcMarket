package uz.husan.pcmarket.entity;

import jakarta.persistence.*;
import uz.husan.pcmarket.entity.enums.Role;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(unique = true)
    private String email;
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role; // ADMIN, USER

    private Double balance = 0.0;
}
