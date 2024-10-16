package com.example.SpringBootMysql.modal;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int seat;
    private Date purchase_date;


    @OneToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    public Ticket() {
    }

    public Ticket(Long id, int seat, Date purchase_date) {
        this.id = id;
        this.seat = seat;
        this.purchase_date = purchase_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeat() {
        return seat;
    }


    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;

        return id.equals(ticket.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String
    toString() {
        return "Ticket{" +
                "id=" + id +
                ", seat=" + seat +
                ", purchase_date=" + purchase_date +
                '}';
    }
}
