package com.hospital.assignment.patient;

import com.hospital.assignment.enums.PrescriptionType;
import lombok.Data;

@Data
public class PrescriptionItem {

  private int itemId;
  private String description;
  private int amount;
  private int quantity;
  private double totalCost;
  private PrescriptionType prescriptionType;
}
