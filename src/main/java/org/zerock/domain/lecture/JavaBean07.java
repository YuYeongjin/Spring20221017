package org.zerock.domain.lecture;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JavaBean07 {
    private int id;
    private LocalDate date;
    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
}
