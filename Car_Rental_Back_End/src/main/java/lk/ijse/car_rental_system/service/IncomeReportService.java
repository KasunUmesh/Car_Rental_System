package lk.ijse.car_rental_system.service;

import lk.ijse.car_rental_system.dto.IncomeReportDTO;

import java.util.List;

public interface IncomeReportService {
    void saveIncomeReport(IncomeReportDTO incomeReportDTO);
    void deleteIncomeReport(String incomeRepoId);
    void updateIncomeReport(IncomeReportDTO incomeReportDTO);
    IncomeReportDTO searchIncomeReport(String incomeRepoId);
    List<IncomeReportDTO> getAllIncomeReport();
}
