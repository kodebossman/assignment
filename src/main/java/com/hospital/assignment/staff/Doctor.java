package com.hospital.assignment.staff;

import lombok.Data;

@Data
public class Doctor extends Staff{

  private String speciality;
  private String jobDescription;
}
