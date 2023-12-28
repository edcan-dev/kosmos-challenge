package dev.edcan.kosmoschallenge.service.impl;

import dev.edcan.kosmoschallenge.model.Doctor;
import dev.edcan.kosmoschallenge.repository.DoctorRepository;
import dev.edcan.kosmoschallenge.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

  DoctorRepository doctorRepository;

  @Autowired
  public DoctorServiceImpl(DoctorRepository doctorRepository) {
    this.doctorRepository = doctorRepository;
  }

  @Override
  public List<Doctor> findAll() {
    return this.doctorRepository.findAll();
  }
}
