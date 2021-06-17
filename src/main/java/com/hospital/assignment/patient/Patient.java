package com.hospital.assignment.patient;

import com.hospital.assignment.common.Person;
import lombok.Data;

@Data
public class Patient extends Person {

  private int patientId;
  private String sickness;
  private String prescription;
  private String description;

  public Patient getPatient(int patientId){

      Patient patient = new Patient();
      patient.setPatientId(patientId);
      patient.setSickness("Chigulani");
      patient.setDescription("Chikhule");
      return patient;
  }
}
