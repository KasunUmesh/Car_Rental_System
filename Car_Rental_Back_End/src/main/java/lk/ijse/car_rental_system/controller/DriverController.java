package lk.ijse.car_rental_system.controller;

import lk.ijse.car_rental_system.dto.DriverDTO;
import lk.ijse.car_rental_system.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {

    @Autowired
    DriverService driverService;

    @GetMapping
    public List<DriverDTO> getAllDriver(){
        return driverService.getAllDriver();
    }

    @PostMapping
    public void saveDriver(@ModelAttribute DriverDTO driverDTO){
        driverService.saveDriver(driverDTO);
    }

    @PutMapping
    public void updateDriver(@RequestBody DriverDTO driverDTO){
        driverService.updateDriver(driverDTO);
    }

    @DeleteMapping(params = {"driverID"})
    public void deleteDriver(@RequestParam String driverID){
        driverService.deleteDriver(driverID);
    }

    @GetMapping(path = "/{driverID}")
    public DriverDTO searchDriver(@PathVariable String driverID){
        return driverService.searchDriver(driverID);
    }

}
