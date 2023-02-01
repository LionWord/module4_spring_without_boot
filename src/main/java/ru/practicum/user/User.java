package ru.practicum.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Email
    @NotEmpty
    @Column(name = "email")
    private String email;
    @NotEmpty
    @Column(name = "name")
    private String name;
}
