package com.hospital.assignment.patient;

import com.hospital.assignment.common.Person;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Prescription {
  // association -a prescription is associated to a person class
  private Patient patient;
  private int prescriptionID;
  private String prescriptionDesc;
  private double prescriptionCost;
  private LocalDateTime prescriptionDate;
  private List<PrescriptionItem> prescriptionItemList;
  private int patientId;

  public Prescription getPreScription(int prescriptionID){

     Prescription prescription= new Prescription();

     return  prescription;
  }
}
