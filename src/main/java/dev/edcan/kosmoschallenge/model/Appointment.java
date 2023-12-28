package dev.edcan.kosmoschallenge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "appointments")
public class Appointment {

  @Id
  private Long id;

  private Long officeNumber;

  private Long doctorId;

  private LocalDateTime dateTime;

  private String patientName;

  public Appointment(Long id, Long officeNumber, Long doctorId, LocalDateTime dateTime, String patientName) {
    this.id = id;
    this.officeNumber = officeNumber;
    this.doctorId = doctorId;
    this.dateTime = dateTime;
    this.patientName = patientName;
  }

  public Appointment() {
  }

  @Override
  public String toString() {
    return "Appointment{" +
            "id=" + id +
            ", officeNumber=" + officeNumber +
            ", doctorId=" + doctorId +
            ", dateTime=" + dateTime +
            ", patientName='" + patientName + '\'' +
            '}';
  }
}
