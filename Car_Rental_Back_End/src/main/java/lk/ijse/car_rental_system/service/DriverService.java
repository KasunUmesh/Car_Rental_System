package lk.ijse.car_rental_system.service;

import lk.ijse.car_rental_system.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDTO driverDTO);
    void deleteDriver(String driverID);
    void updateDriver(DriverDTO driverDTO);
    DriverDTO searchDriver(String driverID);
    List<DriverDTO> getAllDriver();
}
