package com.example.notebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "notebooks")
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String model;

    @Column
    private String producer;

    @Column
    private String processor;

    @Column
    private int memory;

    @Column
    private boolean isUsed;

    @Column
    private String frameType;

    @Column
    private BigInteger price;

    @Column
    private LocalDate birthday;

    public Notebook(String model, String producer, String processor, int memory, boolean isUsed, String frameType, BigInteger price) {
        this.model = model;
        this.producer = producer;
        this.processor = processor;
        this.memory = memory;
        this.isUsed = isUsed;
        this.frameType = frameType;
        this.price = price;
        this.birthday = LocalDate.now();
    }

    public Notebook() {
        this.isUsed = false;
        this.birthday = LocalDate.now();
    }
}
