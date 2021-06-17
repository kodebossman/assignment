package com.hospital.assignment.payments;

import com.hospital.assignment.enums.Status;
import com.hospital.assignment.procuments.ProcumentInvoice;
import com.hospital.assignment.procuments.ProcumentItem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PaymentServiceImpl implements PaymentService{
  @Override
  public Payment makePayment(ProcumentInvoice procumentInvoice, int personId) {

    Payment payment = new Payment();

    payment.setPaymentId((int)Math.floor(Math.random()));
    payment.setPaymentDescription(procumentInvoice.getProcumentDescription());
    payment.setPaymentStatus(Status.DONE);
    payment.setProcumentItemList(procumentInvoice.getProcumentItemList());
    payment.setTotalPayment(calculatePaymentTotal(procumentInvoice.getProcumentItemList()));

    return payment;

  }

  private double calculatePaymentTotal(List<ProcumentItem> procumentItemList){

    return procumentItemList.stream()
      .mapToDouble(procumentItem -> procumentItem.getQuantity() * procumentItem.getTotalCost())
      .sum();
  }
}
