package lk.ijse.car_rental_system.service.impl;

import lk.ijse.car_rental_system.dto.IncomeReportDTO;
import lk.ijse.car_rental_system.entity.IncomeReport;
import lk.ijse.car_rental_system.repo.IncomeReportRepo;
import lk.ijse.car_rental_system.service.IncomeReportService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class IncomeReportServiceImpl implements IncomeReportService {

    @Autowired
    private IncomeReportRepo incomeReportRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveIncomeReport(IncomeReportDTO incomeReportDTO) {
        if (!incomeReportRepo.existsById(incomeReportDTO.getIncomeRepoId())){
            incomeReportRepo.save(modelMapper.map(incomeReportDTO, IncomeReport.class));
        }else {
            throw new RuntimeException("Income Report All Ready Saved");
        }
    }

    @Override
    public void deleteIncomeReport(String incomeRepoId) {
        if (incomeReportRepo.existsById(incomeRepoId)) {
            incomeReportRepo.deleteById(incomeRepoId);
        }else {
            throw new RuntimeException("Income Report Delete Fail");
        }

    }

    @Override
    public void updateIncomeReport(IncomeReportDTO incomeReportDTO) {
        if (incomeReportRepo.existsById(incomeReportDTO.getIncomeRepoId())){
            incomeReportRepo.save(modelMapper.map(incomeReportDTO, IncomeReport.class));
        }else {
            throw new RuntimeException("Income Report Update Fail");
        }

    }

    @Override
    public IncomeReportDTO searchIncomeReport(String incomeRepoId) {
        if (incomeReportRepo.existsById(incomeRepoId)) {
            return modelMapper.map(incomeReportRepo.findById(incomeRepoId).get(), IncomeReportDTO.class);
        }else {
            throw new RuntimeException("Invalid Search");
        }
    }

    @Override
    public List<IncomeReportDTO> getAllIncomeReport() {
        return modelMapper.map(incomeReportRepo.findAll(), new TypeToken<List<IncomeReportDTO>>(){}.getType());
    }
}
