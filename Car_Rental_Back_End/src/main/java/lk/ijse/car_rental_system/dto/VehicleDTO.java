package lk.ijse.car_rental_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class VehicleDTO {
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
