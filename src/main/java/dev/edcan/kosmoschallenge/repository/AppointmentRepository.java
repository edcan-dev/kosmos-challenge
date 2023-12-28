package dev.edcan.kosmoschallenge.repository;

import dev.edcan.kosmoschallenge.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}