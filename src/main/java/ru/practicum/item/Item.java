package ru.practicum.item;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "items")
class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "url")
    private String url;
}