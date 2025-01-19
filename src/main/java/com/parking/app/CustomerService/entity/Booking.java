package com.parking.app.CustomerService.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "tbl_booking")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long garageId;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)//fecha y hora
    private Date creationDate;
    @Column(name = "reservation_date")
    @Temporal(TemporalType.TIMESTAMP)//fecha y hora
    private Date reservationDate;
}
