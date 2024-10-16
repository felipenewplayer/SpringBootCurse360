package com.example.SpringBootMysql.modal;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @OneToOne

}
