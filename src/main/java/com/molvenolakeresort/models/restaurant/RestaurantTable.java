package com.molvenolakeresort.models.restaurant;

import com.molvenolakeresort.models.restaurant.enums.TableShape;

import javax.persistence.*;

@Entity(name = "RestaurantTable")
@Table(name = "restaurant_table")
public class RestaurantTable {

    private @Id @GeneratedValue
    Long idRestaurantTable;

    private TableShape shape;
    private int maxSeats;

    public RestaurantTable() {

    }

    public TableShape getShape() {
        return shape;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public Long getId() {
        return idRestaurantTable;
    }

    public void setIdRestaurantTable(Long idRestaurantTable) {
        this.idRestaurantTable = idRestaurantTable;
    }
}
