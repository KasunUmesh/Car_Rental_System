package lk.ijse.car_rental_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class IncomeReport {
    @Id
    private String incomeRepoId;
    private String yearly;
    private String monthly;
    private String weekly;
    private String daily;
}
