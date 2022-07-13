package lk.ijse.car_rental_system.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CustomerDTO {
    private String userName;
    private String address;
    private String nic;
    private String driverlicen;
    private String email;
    private String contact;
    private String password;
}
