package com.bridgelabz.employeepayrollapp.dto;
import lombok.Data;

//dto
@Data
public class EmployeeDTO {
    private String name;
    private String gender;
    private String department;
    private double salary;
    private String startDate;
}
