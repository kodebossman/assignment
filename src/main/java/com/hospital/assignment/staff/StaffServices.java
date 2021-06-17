package com.hospital.assignment.staff;

import com.hospital.assignment.duties.Shift;
import com.hospital.assignment.patient.PatientHistory;
import com.hospital.assignment.patient.Prescription;
import com.hospital.assignment.patient.PrescriptionItem;
import com.hospital.assignment.payments.Payment;
import com.hospital.assignment.procuments.Procument;
import com.hospital.assignment.procuments.ProcumentInvoice;
import com.hospital.assignment.procuments.ProcumentItem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StaffServices {

  public Prescription givePrescriptions(List<PrescriptionItem> prescriptionItemList, int patientID);
  public PatientHistory treatPatient(int patientId);
  public ProcumentInvoice createInvoice(List<ProcumentItem> procumentItemList, int personId);
  public Shift startShift(int staffId);
  public Shift endShift( Shift shift, int staffId);

}
