package com.hospital.assignment.procuments;

import lombok.Data;

@Data
public class Procument {

  private int procumentId;
  private ProcumentInvoice procumentInvoice;
  private String procumentDescription;
  private String procumentItemId;
  private double totalCost;

}
