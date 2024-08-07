package com.sparta.msa_exam.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long product_id;

    @Column
    private String name;

    @Column
    private Integer supply_price;


}
