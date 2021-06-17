package com.hospital.assignment.duties;

import com.hospital.assignment.enums.ShiftType;
import com.hospital.assignment.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Shift {

  private String shiftName;
  private String dutyDescription;
  private int dutyDuration;
  private ShiftType dutyType;
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private int staffId;
  private Status shiftStatus;
}
