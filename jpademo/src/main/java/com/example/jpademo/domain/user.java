package com.example.jpademo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column
    int bid;
    @Column
    String month;
    @Column
    int score;
    @Column
    String schoolid;
}
