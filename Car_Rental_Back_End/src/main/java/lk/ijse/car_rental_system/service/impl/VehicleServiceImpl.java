package lk.ijse.car_rental_system.service.impl;

import lk.ijse.car_rental_system.dto.VehicleDTO;
import lk.ijse.car_rental_system.entity.Vehicle;
import lk.ijse.car_rental_system.repo.VehicleRepo;
import lk.ijse.car_rental_system.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveVehicle(VehicleDTO vehicleDTO) {

        if (!vehicleRepo.existsById(vehicleDTO.getRegNo())){
            vehicleRepo.save(modelMapper.map(vehicleDTO, Vehicle.class));
        }else {
            throw new RuntimeException("Vehicle All Ready Saved");
        }

    }

    @Override
    public void deleteVehicle(String regNo) {

        if (vehicleRepo.existsById(regNo)) {
            vehicleRepo.deleteById(regNo);
        }else {
            throw new RuntimeException("Vehicle Delete Fail");
        }
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        if (vehicleRepo.existsById(vehicleDTO.getRegNo())) {
            vehicleRepo.save(modelMapper.map(vehicleDTO, Vehicle.class));
        }else {
            throw new RuntimeException("Vehicle Update Fail");
        }

    }

    @Override
    public VehicleDTO searchVehicle(String regNo) {
        if (vehicleRepo.existsById(regNo)) {
            return modelMapper.map(vehicleRepo.findById(regNo).get(), VehicleDTO.class);
        }else {
            throw new RuntimeException("Invalid Search");
        }
    }

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return modelMapper.map(vehicleRepo.findAll(), new TypeToken<List<VehicleDTO>>(){}.getType());
    }
}
