package lk.ijse.car_rental_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class IncomeReportDTO {
    private String incomeRepoId;
    private String yearly;
    private String monthly;
    private String weekly;
    private String daily;
}
