package org.TpProduct.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    protected String product_name;
    protected double price;






}
