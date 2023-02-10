package com.example.swingPractice.jTableExamples1.tableModel;



import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id;

    private String name;

    private String description;

    private BigDecimal unit_price;

    private int units_in_stock;
    private boolean isAvailable = units_in_stock>0?true:false;

}
