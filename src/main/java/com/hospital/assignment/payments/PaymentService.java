package com.hospital.assignment.payments;

import com.hospital.assignment.procuments.ProcumentInvoice;

public interface PaymentService {

  public Payment makePayment(ProcumentInvoice procumentInvoice, int personId);


}
