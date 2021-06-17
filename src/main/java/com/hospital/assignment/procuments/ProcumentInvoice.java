package com.hospital.assignment.procuments;

import lombok.Data;

import java.util.List;
@Data
public class ProcumentInvoice {

  private int procumentId;
  private String procumentDescription;
  private List<ProcumentItem> procumentItemList;
  private double totalInvoiceCost;
}
