package dev.edcan.kosmoschallenge.model;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

  public Doctor(Long id, String name, String firstSurname, String lastSurname) {
    this.id = id;
    this.name = name;
    this.firstSurname = firstSurname;
    this.lastSurname = lastSurname;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private String firstSurname;

  private String lastSurname;

  public Doctor() {

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirstSurname() {
    return firstSurname;
  }

  @Override
  public String toString() {
    return "Doctor{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", firstSurname='" + firstSurname + '\'' +
            ", lastSurname='" + lastSurname + '\'' +
            '}';
  }

  public void setFirstSurname(String firstSurname) {
    this.firstSurname = firstSurname;
  }

  public String getLastSurname() {
    return lastSurname;
  }

  public void setLastSurname(String lastSurname) {
    this.lastSurname = lastSurname;
  }
}
