package com.hospital.assignment.patient;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PatientHistory {

  private int patientId;
  private LocalDateTime dateAttended;
  private String prescription;
  private String totalCost;
}
