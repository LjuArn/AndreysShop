package com.example.andreysshop.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class ItemEntity extends BaseEntity{


}
//•	Has a Name (unique)
//o	Username must be unique
//o	Username length must be more than two characters
//•	Has a Description
//o	Description length must be more than three characters
//•	Has a Price
//o	Price must be positive number
//•	Has a Category
//o	Has a relation with Categories
//•	Has a Gender – an option between (Male and Female)