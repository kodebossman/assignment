package com.hospital.assignment.payments;

import com.hospital.assignment.enums.Status;
import com.hospital.assignment.procuments.ProcumentItem;
import lombok.Data;

import java.util.List;

@Data
public class Payment {

  private int paymentId;
  private String paymentDescription;
  private Status paymentStatus;
  private List<ProcumentItem> procumentItemList;
  private double totalPayment;
  private int procuredBy;
}
