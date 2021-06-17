package com.hospital.assignment.procuments;

import lombok.Data;

@Data
public class ProcumentItem {

  private int procumentItemId;
  private String procumentItemDescription;
  private int quantity;
  private double totalCost;

}
