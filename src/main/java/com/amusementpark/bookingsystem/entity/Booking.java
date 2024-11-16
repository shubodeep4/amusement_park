package com.amusementpark.bookingsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    private LocalDateTime bookingTime;
    private double totalAmount;
}
