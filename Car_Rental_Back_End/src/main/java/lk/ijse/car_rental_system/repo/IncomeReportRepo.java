package lk.ijse.car_rental_system.repo;

import lk.ijse.car_rental_system.entity.IncomeReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeReportRepo extends JpaRepository<IncomeReport, String> {
}
