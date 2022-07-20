package lk.ijse.car_rental_system.service;

import lk.ijse.car_rental_system.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {
    void saveVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String regNo);
    void updateVehicle(VehicleDTO vehicleDTO);
    VehicleDTO searchVehicle(String regNo);
    List<VehicleDTO> getAllVehicle();

}
