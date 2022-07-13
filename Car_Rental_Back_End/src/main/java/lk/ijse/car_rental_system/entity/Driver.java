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
public class Driver {
    @Id
    private String driverID;
    private String name;
    private String address;
    private String nic;
    private String drivingLicen;
    private String contact;
    private String email;
    private String password;
}
