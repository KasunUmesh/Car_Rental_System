package lk.ijse.car_rental_system.service.impl;

import lk.ijse.car_rental_system.dto.DriverDTO;
import lk.ijse.car_rental_system.entity.Driver;
import lk.ijse.car_rental_system.repo.DriverRepo;
import lk.ijse.car_rental_system.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DriversServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveDriver(DriverDTO driverDTO) {
        if (!driverRepo.existsById(driverDTO.getDriverID())){
            driverRepo.save(modelMapper.map(driverDTO, Driver.class));
        }else {
            throw new RuntimeException("Driver All Ready Saved");
        }

    }

    @Override
    public void deleteDriver(String driverID) {
        if (driverRepo.existsById(driverID)) {
            driverRepo.deleteById(driverID);
        }else {
            throw new RuntimeException("Driver Delete Fail");
        }

    }

    @Override
    public void updateDriver(DriverDTO driverDTO) {
        if (driverRepo.existsById(driverDTO.getDriverID())) {
            driverRepo.save(modelMapper.map(driverDTO, Driver.class));
        }else {
            throw new RuntimeException("Driver Update Fail");
        }

    }

    @Override
    public DriverDTO searchDriver(String driverID) {
        if (driverRepo.existsById(driverID)) {
            return modelMapper.map(driverRepo.findById(driverID).get(), DriverDTO.class);
        }else {
            throw new RuntimeException("Invalid Search");
        }
    }

    @Override
    public List<DriverDTO> getAllDriver() {
        return modelMapper.map(driverRepo.findAll(), new TypeToken<List<DriverDTO>>(){}.getType());
    }
}
