package com.hospital.assignment.staff;

import com.hospital.assignment.common.Person;
import lombok.Data;

@Data
public class Staff extends Person {

  private int staffId;
  private String speciality;
  private String jobDescription;
}
