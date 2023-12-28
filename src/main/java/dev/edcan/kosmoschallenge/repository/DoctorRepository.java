package dev.edcan.kosmoschallenge.repository;

import dev.edcan.kosmoschallenge.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
