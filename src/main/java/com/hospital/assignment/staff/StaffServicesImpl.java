package com.hospital.assignment.staff;

import com.hospital.assignment.duties.Shift;
import com.hospital.assignment.enums.Status;
import com.hospital.assignment.patient.Patient;
import com.hospital.assignment.patient.PatientHistory;
import com.hospital.assignment.patient.Prescription;
import com.hospital.assignment.patient.PrescriptionItem;
import com.hospital.assignment.procuments.ProcumentInvoice;
import com.hospital.assignment.procuments.ProcumentItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import java.util.List;
@Service
public class StaffServicesImpl implements StaffServices{
  @Override
  public Prescription givePrescriptions(List<PrescriptionItem> prescriptionItemList, int patientID) {

    Prescription prescription = new Prescription();
    prescription.setPrescriptionDate(LocalDateTime.now());
    prescription.setPatient(new Patient().getPatient(patientID));
    prescription.setPatientId(patientID);
    prescription.setPrescriptionItemList(prescriptionItemList);
    prescription.setPrescriptionCost(calculatePrescriptionTotal(prescriptionItemList));
    return prescription;
  }

  @Override
  public PatientHistory treatPatient(int patientId) {

    PatientHistory patientHistory = new PatientHistory();
    patientHistory.setDateAttended(LocalDateTime.now());
    patientHistory.setPatientId(patientId);
    patientHistory.setPrescription(new Prescription().toString());
    patientHistory.setTotalCost(this.toString());
    return patientHistory;
  }

  @Override
  public ProcumentInvoice createInvoice(List<ProcumentItem> procumentItemList, int personId) {

    ProcumentInvoice procumentInvoice = new ProcumentInvoice();
    procumentInvoice.setProcumentId((int)Math.floor(Math.random()));
    procumentInvoice.setProcumentItemList(procumentItemList);
    procumentInvoice.setProcumentDescription("new Proc");
    procumentInvoice.setTotalInvoiceCost(calculateProcumentTotal(procumentItemList));
    return procumentInvoice;
  }

  @Override
  public Shift startShift(int staffId) {

    Shift shift = new Shift();
    shift.setDutyDescription("On normal duty");
    shift.setDutyDuration(8);
    shift.setStartTime(LocalDateTime.now());
    shift.setShiftStatus(Status.PENDING);
    shift.setEndTime(LocalDateTime.now().plusHours(8));
    shift.setStaffId(staffId);
    return shift;
  }

  @Override
  public Shift endShift(Shift shift, int staffId) {
    shift.setStaffId(staffId);
    shift.setShiftStatus(Status.CANCELLED);
    shift.setEndTime(LocalDateTime.now());
    return shift;
  }

  protected double calculatePrescriptionTotal(List<PrescriptionItem> prescriptionItemList ){

    return prescriptionItemList.stream()
      .mapToDouble(prescriptionItem -> prescriptionItem.getAmount() * prescriptionItem.getQuantity() *prescriptionItem.getTotalCost())
      .sum();
  }

  protected double calculateProcumentTotal(List<ProcumentItem> procumentItemList ){

    return procumentItemList.stream()
      .mapToDouble(procumentItem -> procumentItem.getTotalCost()* procumentItem.getQuantity() )
      .sum();
  }
}
