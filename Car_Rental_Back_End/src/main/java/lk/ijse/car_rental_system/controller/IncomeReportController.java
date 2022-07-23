package lk.ijse.car_rental_system.controller;

import lk.ijse.car_rental_system.dto.IncomeReportDTO;
import lk.ijse.car_rental_system.service.IncomeReportService;
import lk.ijse.car_rental_system.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/incomereport")
@CrossOrigin
public class IncomeReportController {

    @Autowired
    IncomeReportService incomeReportService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveIncomeReport(@ModelAttribute IncomeReportDTO incomeReportDTO){
        incomeReportService.saveIncomeReport(incomeReportDTO);
        return new ResponseUtil(200,"Saved",null);
    }

    @DeleteMapping(params = {"incomeRepoId"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteIncomeReport(@RequestParam String incomeRepoId){
        incomeReportService.deleteIncomeReport(incomeRepoId);
        return new ResponseUtil(200,"Deleted",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateIncomeReport(@RequestBody IncomeReportDTO incomeReportDTO){
        incomeReportService.updateIncomeReport(incomeReportDTO);
        return new ResponseUtil(200, "Updated", null);
    }

    @GetMapping(path = "/{incomeRepoId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchIncomeReport(@PathVariable String incomeRepoId){
        return new ResponseUtil(200, "OK", incomeReportService.searchIncomeReport(incomeRepoId));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllIncomeReport(){
        return new ResponseUtil(200,"OK",incomeReportService.getAllIncomeReport());
    }
}
