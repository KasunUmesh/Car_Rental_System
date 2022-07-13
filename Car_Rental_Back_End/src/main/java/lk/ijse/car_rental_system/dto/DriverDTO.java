package lk.ijse.car_rental_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class DriverDTO {
    private String driverID;
    private String name;
    private String address;
    private String nic;
    private String drivingLicen;
    private String contact;
    private String email;
    private String password;
}
