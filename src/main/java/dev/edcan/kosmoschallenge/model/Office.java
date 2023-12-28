package dev.edcan.kosmoschallenge.model;


import jakarta.persistence.*;

@Entity
@Table(name = "offices")
public class Office {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long number;
  private Long floor;

  public Office(Long number, Long floor) {
    this.number = number;
    this.floor = floor;
  }
  public Office() {
  }
  public Long getNumber() {
    return number;
  }
  public void setNumber(Long number) {
    this.number = number;
  }
  public Long getFloor() {
    return floor;
  }
  public void setFloor(Long floor) {
    this.floor = floor;
  }
}
