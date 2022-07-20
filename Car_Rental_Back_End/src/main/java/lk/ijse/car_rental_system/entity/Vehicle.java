package lk.ijse.car_rental_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Vehicle {
    @Id
    private String regNo;
    private String brand;
    private String type;
    private String transmission;
    private String color;
    private String passengers;
    private String fuelType;
    private String mileage;
    private String rentedStatus;
}
