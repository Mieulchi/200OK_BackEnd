package com._OK._OK.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private int water;
    @Column
    private int food;
    @Column
    private int hp = 10;
    @Column(nullable = false)
    private boolean alive = true;
    @Column
    private int probability = 1;
    @Column
    private int day;


}
